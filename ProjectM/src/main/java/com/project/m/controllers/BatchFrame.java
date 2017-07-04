package com.project.m.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.factory.DaoFactory;
import com.project.m.dao.sql.BatchesDaoImpl;
import com.project.m.entity.EntityBatches;
import com.project.m.exceptions.FrameException;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BatchFrame implements Initializable {
	private Stage dialogWindow;
	private Parent JobHistoriesFrame;
	private Scene JobHistoriesScene;

	private static Integer batchId;

	@FXML
	private TableColumn<EntityBatches, String> batchIdColumn, batchNameColumn, jobCountColumn;

	@FXML
	private TableView<EntityBatches> batchTable;

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

					dialogWindow = new Stage();
					dialogWindow.setTitle("JobHistories");
					dialogWindow.getIcons().add(new Image("/style/simply_migrate_-_icon-0.png"));
					FXMLLoader loader = new FXMLLoader();
					loader.setLocation(getClass().getResource("/fxml/JobHistoriesFrame.fxml"));
					try {
						JobHistoriesFrame = loader.load();
					} catch (IOException e) {
						throw new FrameException("Problem in LOADER StartFrame.fxml", e);
					}
					JobHistoriesScene = new Scene(JobHistoriesFrame);
					dialogWindow.setScene(JobHistoriesScene);
					dialogWindow.setResizable(true);
					dialogWindow.initModality(Modality.APPLICATION_MODAL);
					dialogWindow.showAndWait();
				}
			}
		});
	}

	private void showTable() {
		DaoFactory daoFactory = DaoFactory.getFactory();
		BatchesDaoImpl dbo = daoFactory.getBatchesDao();
		LinkedList<EntityBatches> allBatchesRows = dbo.loadAllBatches();

		ObservableList<EntityBatches> batchesOblist = FXCollections.observableArrayList();
		batchesOblist.addAll(allBatchesRows);

		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesIdSimple());
		batchNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchNameColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesNameSimple());
		// jobCountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		// jobCountColumn.setCellValueFactory(cellData -> cellData.getValue().get);

		batchTable.setItems(batchesOblist);

		batchTable.getSelectionModel().setCellSelectionEnabled(true);
		batchTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		TableUtils.installCopyPasteHandler(batchTable);
		TableUtils.installCopyPasteMenu(batchTable);;
		
	}

	public static Integer getBatchId() {
		return batchId;
	}

	private void setBatchId(Integer batchIdnew) {
		batchId = batchIdnew;
	}

}
