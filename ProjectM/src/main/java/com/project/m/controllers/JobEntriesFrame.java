package com.project.m.controllers;

import java.math.BigInteger;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.project.m.dao.factory.DtoFactory;
import com.project.m.domian.DtoJobEntries;
import com.project.m.utils.TableUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.BigIntegerStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class JobEntriesFrame implements Initializable {
	@FXML
	private TableColumn<DtoJobEntries, String> entryIdColumn, itemStatusColumn, mailboxColumn, msgIdColumn, dateCreatedColumn, folderColumn, subjectColumn, authorColumn, recipientsColumn,
			receivedDateColumn, messageClassColumn, itemTypeColumn, ownerColumn, fileNameColumn, dateModifiedColumn, statusMessageColumn, discoveryDateColumn, pathColumn, nameColumn, owner1Column,
			owner2Column, owner3Column, originalIdColumn, folderIdColumn, failedCountColumn, statusDateColumn, hashBytesColumn, extraDataColumn, messageIdColumn;

	@FXML
	private TableColumn<DtoJobEntries, Integer> jobIdColumn, sizeColumn;
	@FXML
	private TableColumn<DtoJobEntries, BigInteger> folderCountColumn, messageCountColumn, calendarCountColumn, taskCountColumn, contactCountColumn, emailCountColumn, otherCountColumn;
	@FXML
	private TableView<DtoJobEntries> jobEntriesTable;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		showTable();
	}

	private void showTable() {
		Integer batchId = JobHistoriesFrame.getBatchId();

		DtoFactory dtoFactory = DtoFactory.getFactory();

		LinkedList<DtoJobEntries> jobEntriesRows = dtoFactory.getJobEntries(batchId);

		ObservableList<DtoJobEntries> jobEntriesOblist = FXCollections.observableArrayList();
		jobEntriesOblist.addAll(jobEntriesRows);

		entryIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		entryIdColumn.setCellValueFactory(cellData -> cellData.getValue().getEntryIdSimple());
		jobIdColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		jobIdColumn.setCellValueFactory(cellData -> cellData.getValue().getJobIdSimple().asObject());
		itemStatusColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		itemStatusColumn.setCellValueFactory(cellData -> cellData.getValue().getItemStatusSimple());
		mailboxColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		mailboxColumn.setCellValueFactory(cellData -> cellData.getValue().getMailboxSimple());
		msgIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		msgIdColumn.setCellValueFactory(cellData -> cellData.getValue().getMsgIdSimple());
		dateCreatedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		dateCreatedColumn.setCellValueFactory(cellData -> cellData.getValue().getDateCreatedSimple());
		folderColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		folderColumn.setCellValueFactory(cellData -> cellData.getValue().getFolderSimple());
		subjectColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		subjectColumn.setCellValueFactory(cellData -> cellData.getValue().getSubjectSimple());
		authorColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		authorColumn.setCellValueFactory(cellData -> cellData.getValue().getAuthorSimple());
		recipientsColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		recipientsColumn.setCellValueFactory(cellData -> cellData.getValue().getRecipientsSimple());
		receivedDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		receivedDateColumn.setCellValueFactory(cellData -> cellData.getValue().getReceivedDateSimple());
		sizeColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		sizeColumn.setCellValueFactory(cellData -> cellData.getValue().getSizeSimple().asObject());
		messageClassColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		messageClassColumn.setCellValueFactory(cellData -> cellData.getValue().getMessageClassSimple());
		itemTypeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		itemTypeColumn.setCellValueFactory(cellData -> cellData.getValue().getItemTypeSimple());
		ownerColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		ownerColumn.setCellValueFactory(cellData -> cellData.getValue().getOwnerSimple());
		fileNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		fileNameColumn.setCellValueFactory(cellData -> cellData.getValue().getFileNameSimple());
		dateModifiedColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		dateModifiedColumn.setCellValueFactory(cellData -> cellData.getValue().getDateModifiedSimple());
		statusMessageColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		statusMessageColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusMessageSimple());
		discoveryDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		discoveryDateColumn.setCellValueFactory(cellData -> cellData.getValue().getDiscoveryDateSimple());
		pathColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		pathColumn.setCellValueFactory(cellData -> cellData.getValue().getPathSimple());
		nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().getNameSimple());
		folderCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		folderCountColumn.setCellValueFactory(cellData -> cellData.getValue().getFolderCountSimple());
		messageCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		messageCountColumn.setCellValueFactory(cellData -> cellData.getValue().getMessageCountSimple());
		emailCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		emailCountColumn.setCellValueFactory(cellData -> cellData.getValue().getEmailCountSimple());
		calendarCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		calendarCountColumn.setCellValueFactory(cellData -> cellData.getValue().getCalendarCountSimple());
		taskCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		taskCountColumn.setCellValueFactory(cellData -> cellData.getValue().getTaskCountSimple());
		contactCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		contactCountColumn.setCellValueFactory(cellData -> cellData.getValue().getContactCountSimple());
		otherCountColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BigIntegerStringConverter()));
		otherCountColumn.setCellValueFactory(cellData -> cellData.getValue().getOtherCountSimple());
		owner1Column.setCellFactory(TextFieldTableCell.forTableColumn());
		owner1Column.setCellValueFactory(cellData -> cellData.getValue().getOwner1Simple());
		owner2Column.setCellFactory(TextFieldTableCell.forTableColumn());
		owner2Column.setCellValueFactory(cellData -> cellData.getValue().getOwner2Simple());
		owner3Column.setCellFactory(TextFieldTableCell.forTableColumn());
		owner3Column.setCellValueFactory(cellData -> cellData.getValue().getOwner3Simple());
		originalIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		originalIdColumn.setCellValueFactory(cellData -> cellData.getValue().getOriginalIdSimple());
		folderIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		folderIdColumn.setCellValueFactory(cellData -> cellData.getValue().getFolderIdSimple());
		failedCountColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		failedCountColumn.setCellValueFactory(cellData -> cellData.getValue().getFailedCountSimple());
		statusDateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		statusDateColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusDateSimple());
		hashBytesColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		hashBytesColumn.setCellValueFactory(cellData -> cellData.getValue().getHashBytesSimple());
		extraDataColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		extraDataColumn.setCellValueFactory(cellData -> cellData.getValue().getExtraDataSimple());
		messageIdColumn.setCellFactory(TextFieldTableCell.forTableColumn());
		messageIdColumn.setCellValueFactory(cellData -> cellData.getValue().getMessageIdSimple());

		jobEntriesTable.setItems(jobEntriesOblist);

		jobEntriesTable.getSelectionModel().setCellSelectionEnabled(true);
		jobEntriesTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		TableUtils.installCopyPasteHandler(jobEntriesTable);
		TableUtils.installCopyPasteMenu(jobEntriesTable);
	}

}
