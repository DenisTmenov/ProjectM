package com.project.m.utils;

import com.project.m.utils.table.TableKeyEventHandler;
import com.project.m.utils.table.TableMenuEventHandler;

import javafx.scene.control.TableView;

public class TableUtils {

	public static void installCopyPasteHandler(TableView<?> table) {

		table.setOnKeyPressed(new TableKeyEventHandler());

	}
	
	public static void installCopyPasteMenu(TableView<?> table) {
		// Bad version.
		new TableMenuEventHandler(table);

	}

}