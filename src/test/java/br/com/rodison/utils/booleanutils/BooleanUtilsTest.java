package br.com.rodison.utils.booleanutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtilsTest {

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