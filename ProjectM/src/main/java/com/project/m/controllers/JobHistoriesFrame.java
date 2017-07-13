package com.project.m.controllers;

import java.math.BigInteger;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Set;

import com.project.m.dao.factory.DtoFactory;
import com.project.m.domian.DtoJobHistories;
import com.project.m.service.FrameManager;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.transformation.SortedList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.BigIntegerStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class JobHistoriesFrame implements Initializable {
	private static Integer batchId;
	private String columnName;
	private String itemJobStatusCombo;
	private LinkedList<DtoJobHistories> jobHistoriesRows;
	private LinkedList<DtoJobHistories> showRows;

	@FXML
	private TableColumn<DtoJobHistories, String> batchNameColumn, jobStatusColumn, timeStartedColumn,
			timeFinishedColumn, sourceColumn, targetColumn, jobCreatedByColumn, jobModifiedByColumn, jobCreatedColumn,
			jobModifiedColumn, processingOnMachineColumn, lastUpdateColumn, statusMessageColumn, sourceMailboxColumn,
			targetMailboxColumn, statusDateColumn, rehydrationTypeColumn;

	@FXML
	private TableColumn<DtoJobHistories, Integer> jobIdColumn, batchIdColumn, failedCountColumn, priorityColumn,
			processingInBatchColumn, processingRateColumn, percentCompleteColumn, processingItemsColumn;

	@FXML
	private TableColumn<DtoJobHistories, BigInteger> itemsRemainingColumn, itemsFailedColumn, itemsTotalColumn;
	@FXML
	private TableView<DtoJobHistories> jobHistoriesTable;
	@FXML
	private ComboBox<String> sortJobStatusCombo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		jobHistoriesTable.setRowFactory(tv -> new TableRow<DtoJobHistories>() {
			@Override
			public void updateItem(DtoJobHistories item, boolean empty) {
				super.updateItem(item, empty);
				if (item == null) {
					setStyle("");
				} else if (item.getJobStatus().equals("CompleteWithErrors")) {
					setStyle("-fx-background-color: red;");
				} else {
					setStyle("");
				}
			}
		});

		initializeData();
		show();

		jobHistoriesTable.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseClick) {
				if (mouseClick.getButton() == MouseButton.PRIMARY && mouseClick.getClickCount() == 2) {

					discoverColumnName();

					if (columnName.equals("Batch Id")) {
						jobHistoriesTable.getSortOrder().clear();
						if (batchIdColumn.getSortType().equals(TableColumn.SortType.ASCENDING)) {
							batchIdColumn.setSortType(TableColumn.SortType.DESCENDING);
						} else if (batchIdColumn.getSortType().equals(TableColumn.SortType.DESCENDING)) {
							batchIdColumn.setSortType(TableColumn.SortType.ASCENDING);
						}
						jobHistoriesTable.getSortOrder().add(batchIdColumn);
					} else if (columnName.equals("Batch Name")) {
						jobHistoriesTable.getSortOrder().clear();
						if (batchNameColumn.getSortType().equals(TableColumn.SortType.ASCENDING)) {
							batchNameColumn.setSortType(TableColumn.SortType.DESCENDING);
						} else if (batchNameColumn.getSortType().equals(TableColumn.SortType.DESCENDING)) {
							batchNameColumn.setSortType(TableColumn.SortType.ASCENDING);
						}
						jobHistoriesTable.getSortOrder().add(batchNameColumn);
					} else {
						discoverBatchId();
						jobHistoriesTable.getSelectionModel().clearSelection();

						FrameManager frameManager = FrameManager.getFrameManager();
						frameManager.openFrame("JobEntriesFrame", "JobHistories", true, false, true);
					}

				}
			}
		});

		sortJobStatusCombo.setOnAction((event) -> {
			String selected = sortJobStatusCombo.getSelectionModel().getSelectedItem();
			itemJobStatusCombo = selected;
			generateNewRows();
			show();
		});

	}

	private void initializeData() {
		initializeAllColumn();
		initializeRows();
		initializeComboJobStatus();
		addFunction();
	}

	private void initializeAllColumn() {
		batchNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchNameColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchNameSimple());
		jobIdColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		jobIdColumn.setCellValueFactory(cellData -> cellData.getValue().getJobIdSimple().asObject());
		jobStatusColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobStatusColumn.setCellValueFactory(cellData -> cellData.getValue().getJobStatusSimple());
		timeStartedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		timeStartedColumn.setCellValueFactory(cellData -> cellData.getValue().getTimeStartedSimple());
		timeFinishedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		timeFinishedColumn.setCellValueFactory(cellData -> cellData.getValue().getTimeFinishedSimple());
		itemsTotalColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		itemsTotalColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsTotalSimple());
		itemsFailedColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		itemsFailedColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsFailedSimple());
		itemsRemainingColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		itemsRemainingColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsRemainingSimple());
		sourceColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		sourceColumn.setCellValueFactory(cellData -> cellData.getValue().getSourceSimple());
		targetColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		targetColumn.setCellValueFactory(cellData -> cellData.getValue().getTargetSimple());
		jobCreatedByColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobCreatedByColumn.setCellValueFactory(cellData -> cellData.getValue().getJobCreatedBySimple());
		jobModifiedByColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobModifiedByColumn.setCellValueFactory(cellData -> cellData.getValue().getJobModifiedBySimple());
		jobCreatedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobCreatedColumn.setCellValueFactory(cellData -> cellData.getValue().getJobCreatedSimple());
		jobModifiedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobModifiedColumn.setCellValueFactory(cellData -> cellData.getValue().getJobModifiedSimple());
		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchIdSimple().asObject());
		failedCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		failedCountColumn.setCellValueFactory(cellData -> cellData.getValue().getFailedCountSimple().asObject());
		processingInBatchColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		processingInBatchColumn
				.setCellValueFactory(cellData -> cellData.getValue().getProcessingInBatchSimple().asObject());
		processingOnMachineColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		processingOnMachineColumn.setCellValueFactory(cellData -> cellData.getValue().getProcessingOnMachineSimple());
		processingRateColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		processingRateColumn.setCellValueFactory(cellData -> cellData.getValue().getProcessingRateSimple().asObject());
		lastUpdateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		lastUpdateColumn.setCellValueFactory(cellData -> cellData.getValue().getLastUpdateSimple());
		statusMessageColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		statusMessageColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusMessageSimple());
		priorityColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		priorityColumn.setCellValueFactory(cellData -> cellData.getValue().getPrioritySimple().asObject());
		percentCompleteColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		percentCompleteColumn
				.setCellValueFactory(cellData -> cellData.getValue().getPercentCompleteSimple().asObject());
		sourceMailboxColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		sourceMailboxColumn.setCellValueFactory(cellData -> cellData.getValue().getSourceMailboxSimple());
		targetMailboxColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		targetMailboxColumn.setCellValueFactory(cellData -> cellData.getValue().getTargetMailboxSimple());
		processingItemsColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		processingItemsColumn
				.setCellValueFactory(cellData -> cellData.getValue().getProcessingItemsSimple().asObject());
		statusDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		statusDateColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusDateSimple());
		rehydrationTypeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		rehydrationTypeColumn.setCellValueFactory(cellData -> cellData.getValue().getRehydrationTypeSimple());
	}

	private void initializeRows() {
		DtoFactory dtoFactory = DtoFactory.getFactory();
		jobHistoriesRows = dtoFactory.getAllJobHistories();
		showRows = jobHistoriesRows;
	}

	private void initializeComboJobStatus() {
		Set<String> statusJobList = loadJobStatus(jobHistoriesRows);
		sortJobStatusCombo.getItems().addAll(statusJobList);
		sortJobStatusCombo.getSelectionModel().select("All");
	}

	private void show() {
		SortedList<DtoJobHistories> jobHistoriesList = new SortedList<DtoJobHistories>(
				FXCollections.observableArrayList(showRows));

		jobHistoriesList.comparatorProperty().bind(jobHistoriesTable.comparatorProperty());

		jobHistoriesTable.setItems(jobHistoriesList);

	}

	private void addFunction() {
		addMultiSelect();
		addCopyFunction();
		addRowColor();
	}

	private void addMultiSelect() {
		jobHistoriesTable.getSelectionModel().setCellSelectionEnabled(true);
		jobHistoriesTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	private void addCopyFunction() {
		TableUtils.installCopyPasteHandler(jobHistoriesTable);
		TableUtils.installCopyPasteMenu(jobHistoriesTable);
	}

	private void addRowColor() {
		jobHistoriesTable.setRowFactory(tv -> new TableRow<DtoJobHistories>() {
			@Override
			public void updateItem(DtoJobHistories item, boolean empty) {
				super.updateItem(item, empty);
				if (item == null) {
					setStyle("");
				} else if (item.getJobStatus().equals("CompleteWithErrors")) {
					setStyle("-fx-background-color: red;");
				} else {
					setStyle("");
				}
			}
		});
	}

	private void generateNewRows() {
		if (!itemJobStatusCombo.equals("All")) {
			showRows = getRowsByStatus(itemJobStatusCombo);
		} else {
			showRows = jobHistoriesRows;
		}
	}

	private LinkedList<DtoJobHistories> getRowsByStatus(String jobStatus) {
		LinkedList<DtoJobHistories> result = new LinkedList<DtoJobHistories>();

		for (DtoJobHistories rows : jobHistoriesRows) {
			if (rows.getJobStatus().equals(jobStatus)) {
				result.add(rows);
			}
		}
		return result;
	}

	private Set<String> loadJobStatus(LinkedList<DtoJobHistories> jobHistoriesRows) {
		Set<String> statusJob = new HashSet<String>();
		statusJob.add("All");

		for (DtoJobHistories dtoJobHistories : jobHistoriesRows) {
			statusJob.add(dtoJobHistories.getJobStatus());
		}

		return statusJob;

	}

	private void discoverColumnName() {
		TablePosition<?, ?> pos = jobHistoriesTable.getSelectionModel().getSelectedCells().get(0);
		String columnName = pos.getTableColumn().getText();
		this.columnName = columnName;

	}

	private void discoverBatchId() {
		TablePosition<?, ?> pos = jobHistoriesTable.getSelectionModel().getSelectedCells().get(0);
		int index = pos.getRow();
		Integer batchId = jobHistoriesTable.getItems().get(index).getBatchId();
		setBatchId(batchId);

	}

	public static Integer getBatchId() {
		return batchId;
	}

	private void setBatchId(Integer batchIdNew) {
		batchId = batchIdNew;
	}

}
