package com.project.m.utils;

import javafx.beans.property.SimpleStringProperty;

public class SimpleObject {
	private static final SimpleStringProperty SPACE = new SimpleStringProperty(String.valueOf(""));;

	public static SimpleStringProperty convertNullToSpace(SimpleStringProperty str) {
		String value = str.get();
		
		if (value == "null") {
			str = SPACE;
		}

		return str;
	}
}
