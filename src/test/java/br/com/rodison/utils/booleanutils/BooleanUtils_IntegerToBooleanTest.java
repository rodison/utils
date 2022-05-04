package br.com.rodison.utils.booleanutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtils_IntegerToBooleanTest {

	@Test
	void givenIntegerToBoolean_whenAnInteger0IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(0));
	}

	@Test
	void givenIntegerToBoolean_whenAnInteger1IsPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.integerToBoolean(1));
	}

	@Test
	void givenIntegerToBoolean_whenANullIntegerIsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(null));
	}

	@Test
	void givenIntegerToBoolean_whenAnInteger3IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(3));
	}

}