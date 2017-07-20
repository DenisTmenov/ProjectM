package com.project.m.controllers;

import java.math.BigInteger;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Predicate;

import com.project.m.dao.factory.DtoFactory;
import com.project.m.domian.DtoJobHistories;
import com.project.m.exceptions.FrameException;
import com.project.m.service.FrameManager;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.BigIntegerStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class JobHistoriesFrame implements Initializable, ControllerInterface {
	private Integer batchId;
	private String columnName;
	private String itemJobStatusCombo;
	private ObservableList<DtoJobHistories> jobHistoriesRows;
	private ObservableList<DtoJobHistories> showRows;
	private FilteredList<DtoJobHistories> filteredData;

	@FXML
	private TableColumn<DtoJobHistories, String> batchNameColumn, jobStatusColumn, sourceColumn, targetColumn, sourceMailboxColumn, targetMailboxColumn, statusMessageColumn;
	@FXML
	private TableColumn<DtoJobHistories, Integer> jobIdColumn, batchIdColumn;
	@FXML
	private TableColumn<DtoJobHistories, BigInteger> itemsRemainingColumn, itemsFailedColumn, itemsTotalColumn;
	@FXML
	private TableColumn<DtoJobHistories, String> statusDateColumn; // MAKE DATE
	@FXML
	private TableView<DtoJobHistories> jobHistoriesTable;
	@FXML
	private ComboBox<String> sortJobStatusCombo;
	@FXML
	private TextField searchTextField;

	@Deprecated
	@Override
	public void setParameter(String value) {
		throw new FrameException("This method should not be implemented!!!");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeAllColumn();
	}

	@Override
	public void start() {
		initializeRows();
		initializeComboJobStatus();
		initializeFiltredData();
		addFunction();
		activeActions();
		show();
	}

	private void initializeAllColumn() {
		batchNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchNameColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchNameSimple());
		jobIdColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		jobIdColumn.setCellValueFactory(cellData -> cellData.getValue().getJobIdSimple().asObject());
		jobStatusColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobStatusColumn.setCellValueFactory(cellData -> cellData.getValue().getJobStatusSimple());
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
		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchIdSimple().asObject());
		statusMessageColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		statusMessageColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusMessageSimple());
		sourceMailboxColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		sourceMailboxColumn.setCellValueFactory(cellData -> cellData.getValue().getSourceMailboxSimple());
		targetMailboxColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		targetMailboxColumn.setCellValueFactory(cellData -> cellData.getValue().getTargetMailboxSimple());

		// change with correct DATE
		statusDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		statusDateColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusDateSimple());
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

	private void initializeFiltredData() {
		filteredData = new FilteredList<>(showRows, e -> true);
	}

	private void addFunction() {
		TableUtils tableUtils = new TableUtils(jobHistoriesTable);
		tableUtils.installCopyPasteHandler();
		tableUtils.installCopyPasteMenu();
		tableUtils.installMultiSelect();
		addRowColor();
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

	private void activeActions() {
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

		jobHistoriesTable.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseClick) {
				if (mouseClick.getButton() == MouseButton.PRIMARY && mouseClick.getClickCount() == 2 && mouseClick.getY() > 30) {

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

						openNewFrame();

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

		searchTextField.textProperty().addListener((observableValue, oldValue, newValue) -> {
			filteredData.setPredicate((Predicate<? super DtoJobHistories>) dto -> {
				if (newValue == null || newValue.isEmpty()) {
					return true;
				} else {

					String lowerCaseFilter = newValue.toLowerCase();

					try {
						if (String.valueOf(dto.getJobId()).contains(newValue)) {
							return true;
						} else if (String.valueOf(dto.getBatchId()).contains(newValue)) {
							return true;
						} else if (dto.getBatchName().toLowerCase().contains(lowerCaseFilter)) {
							return true;
						} else if (dto.getJobStatus().toLowerCase().contains(lowerCaseFilter)) {
							return true;
						} else if (dto.getSource().toLowerCase().contains(lowerCaseFilter)) {
							return true;
						} else if (dto.getTarget().toLowerCase().contains(lowerCaseFilter)) {
							return true;
						} else if (dto.getSourceMailbox().toLowerCase().contains(lowerCaseFilter)) {
							return true;
						} else if (dto.getTargetMailbox().toLowerCase().contains(lowerCaseFilter)) {
							return true;
						} else if (dto.getStatusMessage().toLowerCase().contains(lowerCaseFilter)) {
							return true;
						}
					} catch (NullPointerException e1) {
						// bad code!!!!!!!!!!
						return false;
					}
					return false;
				}
			});
			SortedList<DtoJobHistories> sortedData = new SortedList<>(filteredData);
			sortedData.comparatorProperty().bind(jobHistoriesTable.comparatorProperty());
			showRows = sortedData;
			show();
		});
	}

	private void openNewFrame() {
		FrameManager frameManager = FrameManager.getFrameManager();
		frameManager.openFrame("JobEntriesFrame", "JobHistories", true, false, true, String.valueOf(batchId));
	}

	private void show() {
		SortedList<DtoJobHistories> jobHistoriesList = new SortedList<DtoJobHistories>(FXCollections.observableArrayList(showRows));

		jobHistoriesList.comparatorProperty().bind(jobHistoriesTable.comparatorProperty());

		jobHistoriesTable.setItems(jobHistoriesList);

	}

	private void generateNewRows() {
		if (!itemJobStatusCombo.equals("All")) {
			showRows = getRowsByStatus(itemJobStatusCombo);
		} else {
			showRows = jobHistoriesRows;
		}
	}

	private ObservableList<DtoJobHistories> getRowsByStatus(String jobStatus) {
		ObservableList<DtoJobHistories> result = FXCollections.observableArrayList();

		for (DtoJobHistories rows : jobHistoriesRows) {
			if (rows.getJobStatus().equals(jobStatus)) {
				result.add(rows);
			}
		}
		return result;
	}

	private Set<String> loadJobStatus(ObservableList<DtoJobHistories> jobHistoriesRows) {
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

	private void setBatchId(Integer batchIdNew) {
		batchId = batchIdNew;
	}

}
