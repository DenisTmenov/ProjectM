package com.project.m.frame;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.sql.DboJobEntriesDaoImpl;
import com.project.m.dao.sql.DboJobHistoriesDaoImpl;
import com.project.m.entity.DboJobEntriesEntity;
import com.project.m.entity.DboJobHistoriesEntity;
import com.project.m.exceptions.FrameException;
import com.project.m.utils.StringUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class JobHistoriesFrame implements Initializable {
	private Stage dialogWindow;
	private Parent JobEntriesFrame;
	private Scene JobEntriesScene;

	@FXML
	private TableColumn<DboJobHistoriesEntity, String> jobIdColumn, jobStatusColumn, timeStartedColumn,
			timeFinishedColumn, targetTypeColumn, sourceTypeColumn, dateFromColumn, dateToColumn, ItemsTotalColumn,
			itemsFailedColumn, itemsRemainingColumn, sMVersionColumn, sourceColumn, targetColumn, jobCreatedByColumn,
			jobModifiedByColumn, jobCreatedColumn, jobModifiedColumn, batchIdColumn, failedCountColumn,
			processingInBatchColumn, processingOnMachineColumn, processingRateColumn, lastUpdateColumn, configColumn,
			statusMessageColumn, priorityColumn, percentCompleteColumn, sourceMailboxColumn, targetMailboxColumn,
			processingItemsColumn, statusDateColumn, rehydrationTypeColumn, ownerIdColumn;

	@FXML
	private TableView<DboJobHistoriesEntity> jobHistoriesTable;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showTable();

		jobHistoriesTable.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {

					dialogWindow = new Stage();
					dialogWindow.setTitle("JobHistories");
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
		Integer batchId = BatchFrame.getBatchId();
		DboJobHistoriesDaoImpl dbo = new DboJobHistoriesDaoImpl();

		LinkedList<DboJobHistoriesEntity> jobHistoriesRows = dbo.loadJobHistoriesByBatchId(batchId);

		ObservableList<DboJobHistoriesEntity> jobHistoriesOblist = FXCollections.observableArrayList();
		jobHistoriesOblist.addAll(jobHistoriesRows);

		jobIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobIdColumn.setCellValueFactory(cellData -> cellData.getValue().getJobIdSimple());
		jobStatusColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobStatusColumn.setCellValueFactory(cellData -> cellData.getValue().getJobStatusSimple());
		timeStartedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		timeStartedColumn.setCellValueFactory(cellData -> cellData.getValue().getTimeStartedSimple());
		timeFinishedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		timeFinishedColumn.setCellValueFactory(cellData -> cellData.getValue().getTimeFinishedSimple());
		targetTypeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		targetTypeColumn.setCellValueFactory(cellData -> cellData.getValue().getTargetTypeSimple());
		sourceTypeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		sourceTypeColumn.setCellValueFactory(cellData -> cellData.getValue().getSourceTypeSimple());
		dateFromColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		dateFromColumn.setCellValueFactory(cellData -> cellData.getValue().getDateFromSimple());
		dateToColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		dateToColumn.setCellValueFactory(cellData -> cellData.getValue().getDateToSimple());
		ItemsTotalColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		ItemsTotalColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsTotalSimple());
		itemsFailedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		itemsFailedColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsFailedSimple());
		itemsRemainingColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		itemsRemainingColumn.setCellValueFactory(cellData -> cellData.getValue().getItemsRemainingSimple());
		sMVersionColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		sMVersionColumn.setCellValueFactory(cellData -> cellData.getValue().getSMVersionSimple());
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
		configColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		configColumn.setCellValueFactory(cellData -> cellData.getValue().getConfigSimple());
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
		ownerIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		ownerIdColumn.setCellValueFactory(cellData -> cellData.getValue().getOwnerIdSimple());

		jobHistoriesTable.setItems(jobHistoriesOblist);

	}

	

}
