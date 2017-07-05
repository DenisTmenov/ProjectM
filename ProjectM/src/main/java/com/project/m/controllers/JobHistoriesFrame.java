package com.project.m.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.factory.DtoFactory;
import com.project.m.domian.DtoJobHistories;
import com.project.m.exceptions.FrameException;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class JobHistoriesFrame implements Initializable {
	private Stage dialogWindow;
	private Parent JobEntriesFrame;
	private Scene JobEntriesScene;
	
	private static Integer batchId;

	@FXML
	private TableColumn<DtoJobHistories, String> jobIdColumn, jobStatusColumn, timeStartedColumn, timeFinishedColumn,
			 itemsTotalColumn, itemsFailedColumn,
			itemsRemainingColumn, sourceColumn, targetColumn, jobCreatedByColumn, jobModifiedByColumn,
			jobCreatedColumn, jobModifiedColumn, batchIdColumn, failedCountColumn, processingInBatchColumn,
			processingOnMachineColumn, processingRateColumn, lastUpdateColumn, statusMessageColumn,
			priorityColumn, percentCompleteColumn, sourceMailboxColumn, targetMailboxColumn, processingItemsColumn,
			statusDateColumn, rehydrationTypeColumn;

	@FXML
	private TableView<DtoJobHistories> jobHistoriesTable;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showTable();

		jobHistoriesTable.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
					TablePosition<?, ?> pos = jobHistoriesTable.getSelectionModel().getSelectedCells().get(0);
					int index = pos.getRow();
					Integer batchId = jobHistoriesTable.getItems().get(index).getBatchId();

					setBatchId(batchId);

					dialogWindow = new Stage();
					dialogWindow.setTitle("JobHistories");
					dialogWindow.getIcons().add(new Image("/style/simply_migrate_-_icon-0.png"));
					FXMLLoader loader = new FXMLLoader();
					loader.setLocation(getClass().getResource("/fxml/JobEntriesFrame.fxml"));
					try {
						JobEntriesFrame = loader.load();
					} catch (IOException e) {
						throw new FrameException("Problem in LOADER JobHistoriesFrame.fxml", e);
					}
					JobEntriesScene = new Scene(JobEntriesFrame);
					dialogWindow.setScene(JobEntriesScene);
					dialogWindow.setResizable(true);
					dialogWindow.initModality(Modality.APPLICATION_MODAL);
					dialogWindow.showAndWait();
				}
			}
		});
	}

	private void showTable() {
		DtoFactory dtoFactory = DtoFactory.getFactory();

		LinkedList<DtoJobHistories> jobHistoriesRows = dtoFactory.getAllJobHistories();

		ObservableList<DtoJobHistories> jobHistoriesOblist = FXCollections.observableArrayList();
		jobHistoriesOblist.addAll(jobHistoriesRows);

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

		jobHistoriesTable.setItems(jobHistoriesOblist);

		jobHistoriesTable.getSelectionModel().setCellSelectionEnabled(true);
		jobHistoriesTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		TableUtils.installCopyPasteHandler(jobHistoriesTable);
		TableUtils.installCopyPasteMenu(jobHistoriesTable);

	}
	
	public static Integer getBatchId() {
		return batchId;
	}

	private void setBatchId(Integer batchIdnew) {
		batchId = batchIdnew;
	}

}
