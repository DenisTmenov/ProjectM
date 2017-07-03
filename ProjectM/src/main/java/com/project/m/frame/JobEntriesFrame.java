package com.project.m.frame;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.sql.DboJobEntriesDaoImpl;
import com.project.m.entity.DboJobEntriesEntity;
import com.project.m.utils.StringUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;

public class JobEntriesFrame implements Initializable {

	@FXML
	private TableColumn<DboJobEntriesEntity, String> entryIdColumn, jobIdColumn, itemStatuColumn;

	@FXML
	private TableView<DboJobEntriesEntity> jobEntriesTable;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showTable();
	}

	private void showTable() {
		Integer batchId = StartFrame.getBatchId();
		DboJobEntriesDaoImpl dbo = new DboJobEntriesDaoImpl();
		/*LinkedList<DboJobEntriesEntity> jobEntriesRows = dbo.loadEntriesByBatchId(batchId);

		//convertNull(allBatchesRows);

		ObservableList<DboJobEntriesEntity> jobEntriesOblist = FXCollections.observableArrayList();
		jobEntriesOblist.addAll(jobEntriesRows);

		entryIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		entryIdColumn.setCellValueFactory(cellData -> cellData.getValue().getEntryIdSimple());
		jobIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		jobIdColumn.setCellValueFactory(cellData -> cellData.getValue().getJobIdSimple());

		jobEntriesTable.setItems(jobEntriesOblist);*/
	}

	/*private LinkedList<DboJobEntriesEntity> convertNull(LinkedList<DboJobEntriesEntity> list) {
		for (DboJobEntriesEntity entity : list) {
			entity.setBatchesName(StringUtils.convertNullToSpace(entity.getBatchesName()));
		}
		return list;
	}*/

}
