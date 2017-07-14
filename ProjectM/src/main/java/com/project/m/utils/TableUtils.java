package com.project.m.utils;

import com.project.m.utils.table.TableKeyEventHandler;
import com.project.m.utils.table.TableMenuEventHandler;

import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;

public class TableUtils {
	private TableView<?> table;

	public TableUtils(TableView<?> table) {
		this.table = table;

	}

	public void installCopyPasteHandler() {
		table.setOnKeyPressed(new TableKeyEventHandler());
	}

	public void installCopyPasteMenu() {
		// Bad version.
		new TableMenuEventHandler(table);
	}

	public void installMultiSelect() {
		table.getSelectionModel().setCellSelectionEnabled(true);
		table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

}