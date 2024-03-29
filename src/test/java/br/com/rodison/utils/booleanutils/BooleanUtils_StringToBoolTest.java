package br.com.rodison.utils.booleanutils;

import br.com.rodison.utils.BooleanUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtils_StringToBoolTest {
	@Test
	void givenString_true_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("true"));
	}

	@Test
	void givenString_TRUE_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("TRUE"));
	}

	@Test
	void givenString_True_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("True"));
	}

	@Test
	void givenString_on_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("on"));
	}

	@Test
	void givenString_On_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("On"));
	}

	@Test
	void givenString_yes_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("yes"));
	}

	@Test
	void givenString_YES_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("YES"));
	}

	@Test
	void givenString_Yes_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("Yes"));
	}

	@Test
	void givenString_S_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("S"));
	}

	@Test
	void givenString_Sim_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("Sim"));
	}

	@Test
	void givenString_1_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("1"));
	}

	@Test
	void givenIntegerBiggerThan1_isPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.stringToBool("3"));
	}




	@Test
	void givenString_false_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("false"));
	}

	@Test
	void givenString_FALSE_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("FALSE"));
	}

	@Test
	void givenString_False_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("False"));
	}

	@Test
	void givenString_off_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("off"));
	}

	@Test
	void givenString_OFF_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("OFF"));
	}

	@Test
	void givenString_Off_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("Off"));
	}

	@Test
	void givenString_no_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("no"));
	}

	@Test
	void givenString_NO_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("NO"));
	}

	@Test
	void givenString_No_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("No"));
	}

	@Test
	void givenString_N_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("N"));
	}

	@Test
	void givenString_Nao_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("Nao"));
	}

	@Test
	void givenString_0_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("0"));
	}

	@Test
	void givenString_null_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool(null));
	}

	@Test
	void givenString_empty_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool(""));
	}

	@Test
	void givenString_emptyWithSpaces_isPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.stringToBool("   "));
	}


}