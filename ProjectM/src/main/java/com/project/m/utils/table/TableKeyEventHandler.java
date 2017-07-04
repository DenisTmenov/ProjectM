package com.project.m.utils.table;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;

public class TableKeyEventHandler implements EventHandler<KeyEvent> {

	KeyCodeCombination copyKeyCodeCompination = new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_ANY);

	@Override
	public void handle(final KeyEvent keyEvent) {
		if (copyKeyCodeCompination.match(keyEvent)) {
			if (keyEvent.getSource() instanceof TableView) {
				copySelectionToClipboard((TableView<?>) keyEvent.getSource());
				keyEvent.consume();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public static void copySelectionToClipboard(TableView<?> table) {

		StringBuilder clipboardString = new StringBuilder();

		ObservableList<TablePosition> positionList = table.getSelectionModel().getSelectedCells();

		int prevRow = -1;

		for (TablePosition position : positionList) {

			int row = position.getRow();
			int col = position.getColumn();

			Object cell = (Object) table.getColumns().get(col).getCellData(row);

			if (cell == null) {
				cell = "";
			}

			if (prevRow == row) {
				clipboardString.append('\t');
			} else if (prevRow != -1) {
				clipboardString.append('\n');
			}

			String text = cell.toString();
			clipboardString.append(text);

			prevRow = row;
		}

		final ClipboardContent clipboardContent = new ClipboardContent();
		clipboardContent.putString(clipboardString.toString());

		Clipboard.getSystemClipboard().setContent(clipboardContent);
	}

}