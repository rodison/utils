package br.com.rodison.utils;

import static br.com.rodison.utils.StringUtils.stringIsEmpty;

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
     * <p>
     * Ex: "true", "on", "yes", "y", "s", "1" or an integer bigger than 1 -> true <br />
     * "false", "off", "no", "n", "0" -> false <br />
     * (this method is case insensitive)
     *
     * @return boolean
     */
    public static boolean stringToBool(final String value) {
        return !stringIsEmpty(value) && !value.equalsIgnoreCase("FALSE") //
                && !value.equalsIgnoreCase("OFF") && !value.equalsIgnoreCase("NO") //
                && !value.equalsIgnoreCase("N") && !value.equalsIgnoreCase("Nao") //
                && !value.equals("0");
    }

    public static String boolToStringYN(boolean valor) {
        if (valor) {
            return "Y";
        }
        return "N";
    }

    public static String boolToStringSN(boolean valor) {
        if (valor) {
            return "S";
        }
        return "N";
    }

    public static String booleanToStringYN(Boolean valor) {
        if (valor != null && valor) {
            return "Y";
        }
        return "N";
    }

    public static String booleanToStringSN(Boolean valor) {
        if (valor != null && valor) {
            return "S";
        }
        return "N";
    }
}

