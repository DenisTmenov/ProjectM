package com.project.m.controllers;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.m.dao.factory.DtoFactory;
import com.project.m.domian.DtoBatches;
import com.project.m.service.FrameManager;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showTable();

		batchTable.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
					TablePosition<?, ?> pos = batchTable.getSelectionModel().getSelectedCells().get(0);
					int index = pos.getRow();
					Integer batchId = batchTable.getItems().get(index).getBatchesId();

					setBatchId(batchId);

					@SuppressWarnings("resource")
					ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

					FrameManager frameManager = (FrameManager) context.getBean("frameManager");
					frameManager.openFrame("JobHistoriesFrame", "JobHistories", true, false, true);

				}
			}
		});
	}

	private void showTable() {
		DtoFactory dtoFactory = DtoFactory.getFactory();

		LinkedList<DtoBatches> batchesRows = dtoFactory.getAllBatches();

		ObservableList<DtoBatches> batchesOblist = FXCollections.observableArrayList();
		batchesOblist.addAll(batchesRows);

		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesIdSimple());
		batchNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchNameColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesNameSimple());
		jobCountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		// jobCountColumn.setCellValueFactory(cellData -> cellData.getValue().get);

		batchTable.setItems(batchesOblist);

		batchTable.getSelectionModel().setCellSelectionEnabled(true);
		batchTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		TableUtils.installCopyPasteHandler(batchTable);
		TableUtils.installCopyPasteMenu(batchTable);
		;

	}

	public static Integer getBatchId() {
		return batchId;
	}

	private void setBatchId(Integer batchIdnew) {
		batchId = batchIdnew;
	}

}
