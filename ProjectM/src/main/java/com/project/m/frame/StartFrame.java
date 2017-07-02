package com.project.m.frame;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.sql.DboBatchesDaoImpl;
import com.project.m.entity.DboBatchesEntity;
import com.project.m.utils.StringUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;

public class StartFrame implements Initializable {
	
	@FXML
    private TableColumn<DboBatchesEntity, String> batchIdColumn, batchNameColumn, jobCountColumn;
	
	@FXML
    private TableView<DboBatchesEntity> batchTable;

	@Override
    public void initialize(URL location, ResourceBundle resources) {
		showTable();
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
        //jobCountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        //jobCountColumn.setCellValueFactory(cellData -> cellData.getValue().get);
        
        batchTable.setItems(batchesOblist);
	}
	
	private LinkedList<DboBatchesEntity> convertNull(LinkedList<DboBatchesEntity> list){
		for(DboBatchesEntity entity : list) {
			entity.setBatchesName(StringUtils.convertNullToSpace(entity.getBatchesName()));
		}
		return list;
	}
}
