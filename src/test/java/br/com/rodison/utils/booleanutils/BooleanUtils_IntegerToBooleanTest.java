package br.com.rodison.utils.booleanutils;

import br.com.rodison.utils.BooleanUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtils_IntegerToBooleanTest {

	@Test
	void givenInteger0IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(0));
	}

	@Test
	void givenInteger1IsPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.integerToBoolean(1));
	}

	@Test
	void givenStringIsPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.integerToBoolean(1));
	}

	@Test
	void givenNullIntegerIsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(null));
	}

	@Test
	void givenInteger3IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(3));
	}

}