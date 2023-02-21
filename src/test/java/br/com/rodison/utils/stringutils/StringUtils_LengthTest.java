package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtils_LengthTest {

	@Test
	void givenLength_whenAnyString_thenReturnTheStringLength() {
		assertEquals(6, StringUtils.length("abcdef"));
	}

	@Test
	void givenLength_whenEmptyString_thenReturn0() {
		assertEquals(0, StringUtils.length(""));
	}

	@Test
	void givenLength_whenNull_thenReturn0() {
		assertEquals(0, StringUtils.length(null));
	}

}