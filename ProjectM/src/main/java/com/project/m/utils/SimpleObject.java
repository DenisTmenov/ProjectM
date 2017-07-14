package com.project.m.utils;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class SimpleObject {
	private static final SimpleStringProperty SPACE = new SimpleStringProperty(String.valueOf(""));
	private static final SimpleObjectProperty<String> SPACE_OBJ = new SimpleObjectProperty<String>(String.valueOf(""));

	public static SimpleStringProperty convertNullToSpace(SimpleStringProperty str) {
		String value = str.get();

		if (value == "null") {
			str = SPACE;
		}

		return str;
	}

	@SuppressWarnings("rawtypes")
	public static SimpleObjectProperty convertNullToSpace(SimpleObjectProperty obj) {
		String value = String.valueOf(obj.get());

		if (value == "null") {
			obj = SPACE_OBJ;
		}

		return obj;
	}

}
