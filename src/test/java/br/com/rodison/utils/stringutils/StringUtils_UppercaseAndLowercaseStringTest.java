package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtils_UppercaseAndLowercaseStringTest {

	@Test
	void givenUppercaseString_whenAnyStringIsPassed_thenReturnUppercasedString() {
		assertEquals("ABC", StringUtils.uppercaseString("abc"));
	}

	@Test
	void givenUppercaseString_whenAStringNullIsPassed_thenReturnNull() {
		assertNull(StringUtils.uppercaseString(null));
	}

	@Test
	void givenUppercaseString_whenAStringEmptyIsPassed_thenReturnEmptyString() {
		assertEquals("", StringUtils.uppercaseString(""));
	}


	@Test
	void givenLowercaseString_whenAnyStringIsPassed_thenReturnLowercasedString() {
		assertEquals("abc", StringUtils.lowercaseString("ABC"));
	}

	@Test
	void givenLowercaseString_whenAStringNullIsPassed_thenReturnNull() {
		assertNull(StringUtils.lowercaseString(null));
	}

	@Test
	void givenLowercaseString_whenAStringEmptyIsPassed_thenReturnEmptyString() {
		assertEquals("", StringUtils.lowercaseString(""));
	}

}