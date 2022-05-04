package br.com.rodison.utils.stringutils;

public class StringUtils {

	private StringUtils() {

	}

	public static boolean stringIsEmpty(String str) {
		return str == null || str.trim().equals("");
	}

}
