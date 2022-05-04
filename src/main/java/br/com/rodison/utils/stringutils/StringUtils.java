package br.com.rodison.utils.stringutils;

public class StringUtils {

	private StringUtils() {

	}

	public static boolean stringIsEmpty(String string) {
		return string == null || string.trim().equals("");
	}

	public static String uppercaseString(String string) {
		if (string == null) {
			return null;
		}
		return string.toUpperCase();
	}

	public static String lowercaseString(String string) {
		if (string == null) {
			return null;
		}
		return string.toLowerCase();
	}
}
