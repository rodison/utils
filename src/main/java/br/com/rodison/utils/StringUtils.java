package br.com.rodison.utils;

import java.math.BigDecimal;
import java.util.Objects;

public class StringUtils {

	private StringUtils() {

	}

	/**
	 * Verify if string is empty
	 *
	 * <pre>
	 * StringUtils.isBlank(null)      = true
	 * StringUtils.isBlank("")        = true
	 * StringUtils.isBlank(" ")       = true
	 * StringUtils.isBlank("bob")     = false
	 * StringUtils.isBlank("  bob  ") = false
	 * </pre>
	 */
	public static boolean stringIsEmpty(final String string) {
		return org.apache.commons.lang3.StringUtils.isBlank(string);
	}

	/**
	 * If string is the text "null", return null	 */
	public static String stringNullToNull(String valor) {
		if (Objects.equals("null", lowercaseString(valor))) {
			return null;
		}
		return valor;
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

	public static int length(final String string) {
		if (string == null) {
			return 0;
		}
		return string.length();
	}

	/**
	 * Convert string to boolean.
	 * <p>
	 * Ex: "true", "on", "yes", "y", "s", "1" or an integer bigger than 1 -> true <br />
	 * "false", "off", "no", "n", "0" -> false <br />
	 * (this method is case insensitive)
	 *
	 * @return boolean
	 */
	public static boolean stringToBool(final String value) {
		return BooleanUtils.stringToBool(value);
	}

	public static BigDecimal stringToBigDecimal(String value) {
		if (StringUtils.stringIsEmpty(value)) {
			return null;
		}
		try {
			return new BigDecimal(value);
		} catch (Exception e) {
			throw new RuntimeException("Invalid value on convert String to BigDecimal. Value: " + value + ".", e);
		}
	}
}
