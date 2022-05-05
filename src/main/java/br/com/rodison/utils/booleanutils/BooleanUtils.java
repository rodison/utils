package br.com.rodison.utils.booleanutils;

import static br.com.rodison.utils.stringutils.StringUtils.stringIsEmpty;

public class BooleanUtils {

	private BooleanUtils() {

	}

	public static Boolean integerToBoolean(final Integer value) {
		return (value != null && value.equals(1));
	}

	public static boolean integerToBool(final Integer value) {
		return (value != null && value.equals(1));
	}

	/**
	 * Convert string to boolean.
	 *
	 * Ex: "true", "on", "yes", "1" or an integer bigger than 1 -> true <br />
	 * "false", "off", "no", "0" -> false <br />
	 * (this method is case insensitive)
	 *
	 * @param value
	 * @return boolean
	 */
	public static boolean stringToBool(final String value) {
		return value != null && !value.equalsIgnoreCase("FALSE") && !value.equalsIgnoreCase("OFF")
				&& !value.equalsIgnoreCase("NO") && !value.equals("0") && !stringIsEmpty(value);
	}
}

