package br.com.rodison.utils.stringutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

	@Test
	void givenStringIsEmpty_whenAString_Empty_IsPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringIsEmpty(""));
	}

	@Test
	void givenStringIsEmpty_whenAString_EmptyWithSpace_IsPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringIsEmpty(" "));
	}

	@Test
	void givenStringIsEmpty_whenAString_EmptyWithSpaces_IsPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringIsEmpty("   "));
	}

	@Test
	void givenStringIsEmpty_whenAString_Null_IsPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringIsEmpty(null));
	}




	@Test
	void givenStringIsEmpty_whenAString_a_IsPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringIsEmpty("a"));
	}

	@Test
	void givenStringIsEmpty_whenAString_0_IsPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringIsEmpty("0"));
	}

	@Test
	void givenStringIsEmpty_whenAString_Any_IsPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringIsEmpty("lalalaLa"));
	}
}