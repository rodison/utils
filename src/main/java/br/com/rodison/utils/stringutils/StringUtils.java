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

	public static String substring(String string, int beginIndex, int endIndex) {
		if (string == null || beginIndex > string.length()) {
			return "";
		}
		if (endIndex > string.length()) {
			return string.substring(beginIndex, string.length());
		}
		return string.substring(beginIndex, endIndex);
	}

	public static String substring(String string, int beginIndex) {
		if (string == null) {
			return "";
		}
		return substring(string, beginIndex, string.length());
	}
}
