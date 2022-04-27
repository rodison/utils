package br.com.rodison.utils.booleanutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtilsTest {

	@Test
	void whenAnInteger0IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(0));
	}

	@Test
	void whenAnInteger1IsPassed_thenReturnTrue() {
		assertTrue(BooleanUtils.integerToBoolean(1));
	}

	@Test
	void whenANullIntegerIsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(null));
	}

	@Test
	void whenAnInteger3IsPassed_thenReturnFalse() {
		assertFalse(BooleanUtils.integerToBoolean(3));
	}

}