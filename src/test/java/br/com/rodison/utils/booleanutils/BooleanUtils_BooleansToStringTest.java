package br.com.rodison.utils.booleanutils;

import br.com.rodison.utils.BooleanUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanUtils_BooleansToStringTest {
	@Test
	void givenTrueIsPassed_whenBoolToStringYNCalled_thenReturnY() {
		assertEquals("Y", BooleanUtils.boolToStringYN(true));
	}
	@Test
	void givenFalseIsPassed_whenBoolToStringYNCalled_thenReturnN() {
		assertEquals("N", BooleanUtils.boolToStringYN(false));
	}
	@Test
	void givenTrueIsPassed_whenBoolToStringSNCalled_thenReturnS() {
		assertEquals("S", BooleanUtils.boolToStringSN(true));
	}
	@Test
	void givenFalseIsPassed_whenBoolToStringSNCalled_thenReturnN() {
		assertEquals("N", BooleanUtils.boolToStringSN(false));
	}

	@Test
	void givenTrueIsPassed_whenBooleanToStringYNCalled_thenReturnY() {
		assertEquals("Y", BooleanUtils.booleanToStringYN(new Boolean(true)));
	}
	@Test
	void givenFalseIsPassed_whenBooleanToStringYNCalled_thenReturnN() {
		assertEquals("N", BooleanUtils.booleanToStringYN(new Boolean(false)));
	}
	@Test
	void givenTrueIsPassed_whenBooleanToStringSNCalled_thenReturnS() {
		assertEquals("S", BooleanUtils.booleanToStringSN(new Boolean(true)));
	}
	@Test
	void givenFalseIsPassed_whenBooleanToStringSNCalled_thenReturnN() {
		assertEquals("N", BooleanUtils.booleanToStringSN(new Boolean(false)));
	}
	@Test
	void givenNullIsPassed_whenBooleanToStringYNCalled_thenReturnN() {
		assertEquals("N", BooleanUtils.booleanToStringYN(null));
	}
	@Test
	void givenNullIsPassed_whenBooleanToStringSNCalled_thenReturnN() {
		assertEquals("N", BooleanUtils.booleanToStringSN(null));
	}
}