package br.com.rodison.utils.stringutils;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static br.com.rodison.utils.StringUtils.stringToBigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtils_StringToBigDecimalTest {

    @Test
    void givenStringValid_thenReturnBigDecimalValid() {
        assertEquals(new BigDecimal(15000.05).setScale(2, BigDecimal.ROUND_HALF_UP), //
                stringToBigDecimal("15000.05"));
    }

    @Test
    void givenEmptyString_thenReturnNull() {
        assertNull(stringToBigDecimal(""));
    }

    @Test
    void givenNull_thenReturnNull() {
        assertNull(stringToBigDecimal(null));
    }

    @Test
    void givenInvalidString_thenThrowsRuntimeException() {
        try {
            stringToBigDecimal("abc");
            throw new RuntimeException("Erro no teste");
        } catch (RuntimeException e) {
            assertEquals("Invalid value on convert String to BigDecimal. Value: \"abc\"", e.getMessage());
        }
    }

    @Test
    void givenStringInvalidWithCommas_thenReturnBigDecimalValid() {
        try {
            stringToBigDecimal("10,5");
            throw new RuntimeException("Erro no teste");
        } catch (RuntimeException e) {
            assertEquals("Invalid value on convert String to BigDecimal. Value: \"10,5\"", e.getMessage());
        }
    }

}