package com.project.m.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.project.m.dao.factory.DtoFactory;
import com.project.m.domian.DtoBatches;
import com.project.m.exceptions.FrameException;
import com.project.m.utils.ConverterData;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.BooleanStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class BatchFrame implements Initializable, ControllerInterface {
	private ObservableList<DtoBatches> batches;

	@FXML
	private TableColumn<DtoBatches, Integer> batchIdColumn;
	@FXML
	private TableColumn<DtoBatches, String> batchNameColumn, createDateColumn;
	@FXML
	private TableColumn<DtoBatches, Boolean> isActiveColumn;
	@FXML
	private TableView<DtoBatches> batchesTable;

	@Deprecated
	@Override
	public void setParameter(String value) {
		throw new FrameException("This method should not be implemented!!!");
	}

	@Override
	public void start() {
		initializeRows();
		addFunction();
		show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeAllColumn();

	}

	private void initializeAllColumn() {
		batchIdColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		batchIdColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesIdSimple().asObject());
		batchNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		batchNameColumn.setCellValueFactory(cellData -> cellData.getValue().getBatchesNameSimple());
		createDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		createDateColumn.setCellValueFactory(cellData -> ConverterData.convertDataToSimpleStringProperty(cellData.getValue().getCreateDate()));
		isActiveColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BooleanStringConverter()));
		isActiveColumn.setCellValueFactory(cellData -> cellData.getValue().getIsActiveSimple());
	}

	private void initializeRows() {
		DtoFactory dtoFactory = DtoFactory.getFactory();
		batches = dtoFactory.getAllBatches();
	}

	private void addFunction() {
		TableUtils tableUtils = new TableUtils(batchesTable);
		tableUtils.installCopyPasteHandler();
		tableUtils.installCopyPasteMenu();
		tableUtils.installMultiSelect();
	}

	private void show() {
		SortedList<DtoBatches> batchesList = new SortedList<DtoBatches>(FXCollections.observableArrayList(batches));

		batchesList.comparatorProperty().bind(batchesTable.comparatorProperty());

		batchesTable.setItems(batchesList);

	}

}
