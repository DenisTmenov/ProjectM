package com.project.m.controllers;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.factory.DtoFactory;
import com.project.m.domian.DtoBatches;
import com.project.m.service.FrameManager;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;

public class BatchFrame implements Initializable {

	private static Integer batchId;

	@FXML
	private TableColumn<DtoBatches, String> batchIdColumn, batchNameColumn, jobCountColumn;

	@FXML
	private TableView<DtoBatches> batchTable;

	private LinkedList<DtoBatches> batchesRows;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeData();
		addFunction();
		show();
	}

	private void initializeData() {
		initializeAllColumn();
		initializeRows();
	}

	private void initializeAllColumn() {
		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesIdSimple());
		batchNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchNameColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesNameSimple());
		jobCountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		// jobCountColumn.setCellValueFactory(cellData -> cellData.getValue().get);
	}

	private void initializeRows() {
		DtoFactory dtoFactory = DtoFactory.getFactory();

		batchesRows = dtoFactory.getAllBatches();
	}

	private void show() {
		ObservableList<DtoBatches> batchesOblist = FXCollections.observableArrayList();

		batchesOblist.addAll(batchesRows);

		batchTable.setItems(batchesOblist);
	}

	private void addFunction() {
		TableUtils tableUtils = new TableUtils(batchTable);
		tableUtils.installCopyPasteHandler();
		tableUtils.installCopyPasteMenu();
		tableUtils.installMultiSelect();

		batchTable.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
					TablePosition<?, ?> pos = batchTable.getSelectionModel().getSelectedCells().get(0);
					int index = pos.getRow();
					Integer batchId = batchTable.getItems().get(index).getBatchesId();

					setBatchId(batchId);

					FrameManager frameManager = FrameManager.getFrameManager();
					frameManager.openFrame("JobHistoriesFrame", "JobHistories", true, false, true);

				}
			}
		});
	}

	public static Integer getBatchId() {
		return batchId;
	}

	private void setBatchId(Integer batchIdnew) {
		batchId = batchIdnew;
	}

}
