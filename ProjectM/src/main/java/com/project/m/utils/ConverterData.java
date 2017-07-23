package com.project.m.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.beans.property.SimpleStringProperty;

public class ConverterData {
	private static final String DATA_FORMAT = "dd/MMM/yy HH:mm";

	public static SimpleStringProperty convertDataToSimpleStringProperty(Date date) {
		SimpleStringProperty statusDateSimple = null;
		if (date != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(DATA_FORMAT);
			statusDateSimple = new SimpleStringProperty(dateFormat.format(date));
		} else {
			statusDateSimple = new SimpleStringProperty(String.valueOf(""));
		}
		return statusDateSimple;
	}

}
