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

	public static String diviveCamelCase(String word) {
		String result = "";
		char[] charArray = word.toCharArray();
		result += charArray[0];
		for (int i = 1; i < charArray.length; i++) {
			String simvol = String.valueOf(charArray[i]);
			if (simvol.matches("[A-ZА-Я]")) {
				result += " " + simvol;
			} else {
				result += simvol;
			}
		}
		return result;
	}

}
