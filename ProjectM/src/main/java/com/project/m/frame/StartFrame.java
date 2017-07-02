package com.project.m.frame;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.sql.DboBatchesDaoImpl;
import com.project.m.entity.DboBatchesEntity;
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
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StartFrame implements Initializable {
	private Stage dialogWindow;
	private Parent JobEntriesFrame;
	private Scene jobEntriesScene;

	@FXML
	private TableColumn<DboBatchesEntity, String> batchIdColumn, batchNameColumn, jobCountColumn;

	@FXML
	private TableView<DboBatchesEntity> batchTable;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showTable();

		batchTable.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
					dialogWindow = new Stage();
					dialogWindow.setTitle("JobEntries");
					FXMLLoader loader = new FXMLLoader();
					loader.setLocation(getClass().getResource("/fxml/JobEntriesFrame.fxml"));
					try {
						JobEntriesFrame = loader.load();
					} catch (IOException e) {
						throw new FrameException("Problem in LOADER StartFrame.fxml", e);
					}
					jobEntriesScene = new Scene(JobEntriesFrame);
					dialogWindow.setScene(jobEntriesScene);
					dialogWindow.setResizable(true);
					dialogWindow.initModality(Modality.APPLICATION_MODAL);
					dialogWindow.showAndWait();
				}
			}
		});
	}

	private void showTable() {
		DboBatchesDaoImpl dbo = new DboBatchesDaoImpl();
		LinkedList<DboBatchesEntity> allBatchesRows = dbo.loadByAllBatches();

		convertNull(allBatchesRows);

		ObservableList<DboBatchesEntity> batchesOblist = FXCollections.observableArrayList();
		batchesOblist.addAll(allBatchesRows);

		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesIdSimple());
		batchNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchNameColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesNameSimple());
		// jobCountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		// jobCountColumn.setCellValueFactory(cellData -> cellData.getValue().get);

		batchTable.setItems(batchesOblist);
	}

	private LinkedList<DboBatchesEntity> convertNull(LinkedList<DboBatchesEntity> list) {
		for (DboBatchesEntity entity : list) {
			entity.setBatchesName(StringUtils.convertNullToSpace(entity.getBatchesName()));
		}
		return list;
	}

}
