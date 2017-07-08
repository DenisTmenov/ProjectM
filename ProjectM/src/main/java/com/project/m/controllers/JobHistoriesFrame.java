package com.project.m.controllers;

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
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class JobHistoriesFrame implements Initializable {
	private static Integer batchId;
	private String columnName;
	private String itemJobStatusCombo;
	private LinkedList<DtoJobHistories> jobHistoriesRows;
	private LinkedList<DtoJobHistories> showRows;

	@FXML
	private TableColumn<DtoJobHistories, String> jobIdColumn, jobStatusColumn, timeStartedColumn, timeFinishedColumn,
			itemsTotalColumn, itemsFailedColumn, itemsRemainingColumn, sourceColumn, targetColumn, jobCreatedByColumn,
			jobModifiedByColumn, jobCreatedColumn, jobModifiedColumn, batchIdColumn, failedCountColumn,
			processingInBatchColumn, processingOnMachineColumn, processingRateColumn, lastUpdateColumn,
			statusMessageColumn, priorityColumn, percentCompleteColumn, sourceMailboxColumn, targetMailboxColumn,
			processingItemsColumn, statusDateColumn, rehydrationTypeColumn;

	@FXML
	private TableView<DtoJobHistories> jobHistoriesTable;
	@FXML
	private ComboBox<String> sortJobStatusCombo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeData();
		show();

		jobHistoriesTable.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getButton().equals(MouseButton.PRIMARY) && mouseEvent.getClickCount() == 2) {
					// It does not work well
					discoverColumnName();

					if (columnName.equals("Batch Id")) {
						batchIdColumn.setSortType(TableColumn.SortType.ASCENDING);
						jobHistoriesTable.getSortOrder().add(batchIdColumn);

					} else if (columnName.equals("Batch Name")) {
						// this column didn't create
						jobHistoriesTable.getSortOrder().add(batchIdColumn);
					} else {
						discoverBatchId();

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

	private void show() {
		SortedList<DtoJobHistories> jobHistoriesList = new SortedList<DtoJobHistories>(
				FXCollections.observableArrayList(showRows));

		jobHistoriesList.comparatorProperty().bind(jobHistoriesTable.comparatorProperty());

		jobHistoriesTable.setItems(jobHistoriesList);

		jobHistoriesTable.getSelectionModel().setCellSelectionEnabled(true);
		jobHistoriesTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		TableUtils.installCopyPasteHandler(jobHistoriesTable);
		TableUtils.installCopyPasteMenu(jobHistoriesTable);

	}

	private void initializeData() {
		initializeAllColumn();
		initializeRows();
		initializeJobHistoriesRow();
		initializeComboJobStatus();
	}

	private void initializeAllColumn() {
		jobIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobIdColumn.setCellValueFactory(cellData -> cellData.getValue().getJobIdSimple());
		jobStatusColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobStatusColumn.setCellValueFactory(cellData -> cellData.getValue().getJobStatusSimple());
		timeStartedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		timeStartedColumn.setCellValueFactory(cellData -> cellData.getValue().getTimeStartedSimple());
		timeFinishedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		timeFinishedColumn.setCellValueFactory(cellData -> cellData.getValue().getTimeFinishedSimple());
		itemsTotalColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		itemsTotalColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsTotalSimple());
		itemsFailedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		itemsFailedColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsFailedSimple());
		itemsRemainingColumn.setCellFactory(TextFieldTableCell.forTableColumn());
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
		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchIdSimple());
		failedCountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		failedCountColumn.setCellValueFactory(cellData -> cellData.getValue().getFailedCountSimple());
		processingInBatchColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		processingInBatchColumn.setCellValueFactory(cellData -> cellData.getValue().getProcessingInBatchSimple());
		processingOnMachineColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		processingOnMachineColumn.setCellValueFactory(cellData -> cellData.getValue().getProcessingOnMachineSimple());
		processingRateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		processingRateColumn.setCellValueFactory(cellData -> cellData.getValue().getProcessingRateSimple());
		lastUpdateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		lastUpdateColumn.setCellValueFactory(cellData -> cellData.getValue().getLastUpdateSimple());
		statusMessageColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		statusMessageColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusMessageSimple());
		priorityColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		priorityColumn.setCellValueFactory(cellData -> cellData.getValue().getPrioritySimple());
		percentCompleteColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		percentCompleteColumn.setCellValueFactory(cellData -> cellData.getValue().getPercentCompleteSimple());
		sourceMailboxColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		sourceMailboxColumn.setCellValueFactory(cellData -> cellData.getValue().getSourceMailboxSimple());
		targetMailboxColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		targetMailboxColumn.setCellValueFactory(cellData -> cellData.getValue().getTargetMailboxSimple());
		processingItemsColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		processingItemsColumn.setCellValueFactory(cellData -> cellData.getValue().getProcessingItemsSimple());
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

	private void initializeJobHistoriesRow() {
		DtoFactory dtoFactory = DtoFactory.getFactory();
		jobHistoriesRows = dtoFactory.getAllJobHistories();
	}

	private void initializeComboJobStatus() {
		Set<String> statusJobList = loadJobStatus(jobHistoriesRows);
		sortJobStatusCombo.getItems().addAll(statusJobList);
	}

	private void generateNewRows() {
		if (!itemJobStatusCombo.equals("")) {
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
		statusJob.add("");

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

	private void setBatchId(Integer batchIdnew) {
		batchId = batchIdnew;
	}

}
