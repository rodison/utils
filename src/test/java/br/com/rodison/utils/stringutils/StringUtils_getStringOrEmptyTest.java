package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtils_getStringOrEmptyTest {

	@Test
	void givenNull_thenReturnEmptyString() {
		assertEquals("", StringUtils.getStringOrEmpty(null));
	}

	@Test
	void givenEmptyString_thenReturnEmptyString() {
		assertEquals("", StringUtils.getStringOrEmpty(""));
	}

	@Test
	void givenString_thenReturnString() {
		assertEquals("abc", StringUtils.getStringOrEmpty("abc"));
	}

	@Test
	void givenInteger_thenReturnIntegerAsString() {
		assertEquals("123", StringUtils.getStringOrEmpty(123));
	}

}