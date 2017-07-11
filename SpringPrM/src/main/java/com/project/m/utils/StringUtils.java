package com.project.m.utils;

public final class StringUtils {

	public static final String EMPTY_STR = "";

	private StringUtils() {
		throw new AssertionError("Class contains static methods only. You should not instantiate it!");
	}

	public static String convertNullToSpace(String str) {
		if (str == null) {
			return EMPTY_STR;
		} else
			return str;
	}

}
