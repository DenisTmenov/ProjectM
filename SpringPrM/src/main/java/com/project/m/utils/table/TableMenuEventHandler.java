package com.project.m.utils.table;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class TableMenuEventHandler {

	public TableMenuEventHandler(TableView<?> table) {
		MenuItem item = new MenuItem("Copy");
		item.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("rawtypes")
			@Override
			public void handle(ActionEvent event) {
				ObservableList<TablePosition> posList = table.getSelectionModel().getSelectedCells();
				int old_r = -1;
				StringBuilder clipboardString = new StringBuilder();
				for (TablePosition p : posList) {
					int r = p.getRow();
					int c = p.getColumn();
					Object cell = table.getColumns().get(c).getCellData(r);
					if (cell == null)
						cell = "";
					if (old_r == r)
						clipboardString.append('\t');
					else if (old_r != -1)
						clipboardString.append('\n');
					clipboardString.append(cell);
					old_r = r;
				}
				final ClipboardContent content = new ClipboardContent();
				content.putString(clipboardString.toString());
				Clipboard.getSystemClipboard().setContent(content);
			}
		});
		ContextMenu menu = new ContextMenu();
		menu.getItems().add(item);
		table.setContextMenu(menu);

	}

}
