package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtils_getStringTest {

	@Test
	void givenNull_thenReturnNull() {
		assertNull(StringUtils.getString(null));
	}

	@Test
	void givenEmptyString_thenReturnEmptyString() {
		assertEquals("", StringUtils.getString(""));
	}

	@Test
	void givenString_thenReturnString() {
		assertEquals("abc", StringUtils.getString("abc"));
	}

	@Test
	void givenInteger_thenReturnIntegerAsString() {
		assertEquals("123", StringUtils.getString(123));
	}

}