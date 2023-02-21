package br.com.rodison.utils.booleanutils;

import br.com.rodison.utils.BooleanUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtils_IntegerToBoolTest {

	@Test
	void givenIntegerToBool_whenAnInteger0IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBool(0));
	}

	@Test
	void givenIntegerToBool_whenAnInteger1IsPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.integerToBool(1));
	}

	@Test
	void givenIntegerToBool_whenANullIntegerIsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBool(null));
	}

	@Test
	void givenIntegerToBool_whenAnInteger3IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBool(3));
	}

}