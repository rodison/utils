package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtils_StringToBoolTest {
	@Test
	void givenString_true_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("true"));
	}

	@Test
	void givenString_TRUE_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("TRUE"));
	}

	@Test
	void givenString_True_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("True"));
	}

	@Test
	void givenString_on_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("on"));
	}

	@Test
	void givenString_On_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("On"));
	}

	@Test
	void givenString_yes_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("yes"));
	}

	@Test
	void givenString_YES_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("YES"));
	}

	@Test
	void givenString_Yes_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("Yes"));
	}

	@Test
	void givenString_S_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("S"));
	}

	@Test
	void givenString_Sim_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("Sim"));
	}

	@Test
	void givenString_1_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("1"));
	}

	@Test
	void givenIntegerBiggerThan1_isPassed_thenReturnTrue() {
		assertTrue(StringUtils.stringToBool("3"));
	}




	@Test
	void givenString_false_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("false"));
	}

	@Test
	void givenString_FALSE_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("FALSE"));
	}

	@Test
	void givenString_False_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("False"));
	}

	@Test
	void givenString_off_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("off"));
	}

	@Test
	void givenString_OFF_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("OFF"));
	}

	@Test
	void givenString_Off_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("Off"));
	}

	@Test
	void givenString_no_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("no"));
	}

	@Test
	void givenString_NO_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("NO"));
	}

	@Test
	void givenString_No_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("No"));
	}

	@Test
	void givenString_N_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("N"));
	}

	@Test
	void givenString_Nao_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("Nao"));
	}

	@Test
	void givenString_0_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("0"));
	}

	@Test
	void givenString_null_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool(null));
	}

	@Test
	void givenString_empty_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool(""));
	}

	@Test
	void givenString_emptyWithSpaces_isPassed_thenReturnFalse() {
		assertFalse(StringUtils.stringToBool("   "));
	}


}