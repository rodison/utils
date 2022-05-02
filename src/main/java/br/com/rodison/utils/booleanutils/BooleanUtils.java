package br.com.rodison.utils.booleanutils;

public class BooleanUtils {

	private BooleanUtils() {

	}

	public static Boolean integerToBoolean(Integer value) {
		return (value != null && value.equals(1));
	}

	public static boolean integerToBool(Integer value) {
		return (value != null && value.equals(1));
	}
}

