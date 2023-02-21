package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtils_StringNullToNull {

	@Test
	void givenStringNull_thenReturnsNull() {
		assertNull(StringUtils.stringNullToNull(null));
	}
	@Test
	void givenStringEmpty_thenReturnEmptyString() {
		assertEquals("", StringUtils.stringNullToNull(""));
	}
	@Test
	void givenStringFilled_thenReturnStringFilled() {
		assertEquals("abc", StringUtils.stringNullToNull("abc"));
	}
	@Test
	void givenStringTextNullLowercase_returnNull() {
		assertNull(StringUtils.stringNullToNull("null"));
	}
	@Test
	void givenStringTextNullUppercase_returnNull() {
		assertNull(StringUtils.stringNullToNull("NULL"));
	}
	@Test
	void givenStringTextNullCamelcase_returnNull() {
		assertNull(StringUtils.stringNullToNull("Null"));
	}

}