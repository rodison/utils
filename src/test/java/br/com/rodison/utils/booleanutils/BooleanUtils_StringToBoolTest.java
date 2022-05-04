package br.com.rodison.utils.booleanutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtils_StringToBoolTest {
	@Test
	void givenStringToBool_whenAString_true_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("true"));
	}

	@Test
	void givenStringToBool_whenAString_TRUE_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("TRUE"));
	}

	@Test
	void givenStringToBool_whenAString_True_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("True"));
	}

	@Test
	void givenStringToBool_whenAString_on_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("on"));
	}

	@Test
	void givenStringToBool_whenAString_On_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("On"));
	}

	@Test
	void givenStringToBool_whenAString_yes_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("yes"));
	}

	@Test
	void givenStringToBool_whenAString_YES_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("YES"));
	}

	@Test
	void givenStringToBool_whenAString_Yes_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("Yes"));
	}

	@Test
	void givenStringToBool_whenAString_1_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("1"));
	}

	@Test
	void givenStringToBool_whenAnIntegerBiggerThan1_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("3"));
	}




	@Test
	void givenStringToBool_whenAString_false_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("false"));
	}

	@Test
	void givenStringToBool_whenAString_FALSE_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("FALSE"));
	}

	@Test
	void givenStringToBool_whenAString_False_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("False"));
	}

	@Test
	void givenStringToBool_whenAString_off_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("off"));
	}

	@Test
	void givenStringToBool_whenAString_OFF_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("OFF"));
	}

	@Test
	void givenStringToBool_whenAString_Off_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("Off"));
	}

	@Test
	void givenStringToBool_whenAString_no_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("no"));
	}

	@Test
	void givenStringToBool_whenAString_NO_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("NO"));
	}

	@Test
	void givenStringToBool_whenAString_No_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("No"));
	}

	@Test
	void givenStringToBool_whenAString_0_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("0"));
	}

	@Test
	void givenStringToBool_whenAString_null_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool(null));
	}

	@Test
	void givenStringToBool_whenAString_empty_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool(""));
	}

	@Test
	void givenStringToBool_whenAString_emptyWithSpaces_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("   "));
	}


}