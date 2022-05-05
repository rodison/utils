package br.com.rodison.utils.stringutils;

public class StringUtils {

	private StringUtils() {

	}

	public static boolean stringIsEmpty(final String string) {
		return string == null || string.trim().equals("");
	}

	public static String uppercaseString(final String string) {
		if (string == null) {
			return null;
		}
		return string.toUpperCase();
	}

	public static String lowercaseString(final String string) {
		if (string == null) {
			return null;
		}
		return string.toLowerCase();
	}

	public static String substring(final String string, final int beginIndex, final int endIndex) {
		if (string == null || beginIndex > string.length()) {
			return "";
		}
		if (endIndex > string.length()) {
			return string.substring(beginIndex, string.length());
		}
		return string.substring(beginIndex, endIndex);
	}

	public static String substring(final String string, final int beginIndex) {
		if (string == null) {
			return "";
		}
		return substring(string, beginIndex, string.length());
	}

	public static String trim(final String string) {
		if (string == null) {
			return "";
		}
		return string.trim();
	}

	public static String replace(final String string, final String expressionToReplace, final String replaceBy) {
		if (string == null) {
			return "";
		}
		if (stringIsEmpty(expressionToReplace)) {
			return string;
		}
		final String replaceByProcessed = replaceBy == null ? "" : replaceBy;
		return string.replaceAll(expressionToReplace, replaceByProcessed);
	}
}
