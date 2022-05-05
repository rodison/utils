package br.com.rodison.utils.stringutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtils_SubstringTest {

	@Test
	void givenSubstring_whenSubstractFromBeginingUpToTheMiddle_thenReturnStringSubstracted() {
		assertEquals("abc", StringUtils.substring("abcdef", 0, 3));
	}

	@Test
	void givenSubstring_whenSubstractLastCharacter_thenReturnLastCharacter() {
		assertEquals("f", StringUtils.substring("abcdef", 5, 6));
	}

	@Test
	void givenSubstring_whenSubstractFromMiddleUpToAfterTheEnd_thenReturnStringFromTheMiddleUpToTheEnd() {
		assertEquals("def", StringUtils.substring("abcdef", 3, 10));
	}

	@Test
	void givenSubstring_whenSubstractAfterTheEnd_thenReturnEmptyString() {
		assertEquals("", StringUtils.substring("abcdef", 10, 20));
	}

	@Test
	void givenSubstring_whenSubstractNull_thenReturnEmptyString() {
		assertEquals("", StringUtils.substring(null, 1, 2));
	}

	@Test
	void givenSubstring_whenSubstractEmptyString_thenReturnEmptyString() {
		assertEquals("", StringUtils.substring("", 1, 2));
	}


	@Test
	void givenSubstringJustWithTheBegining_whenSubstractFromBegining_thenReturnWholeString() {
		assertEquals("abcdef", StringUtils.substring("abcdef", 0));
	}

	@Test
	void givenSubstringJustWithTheBegining_whenSubstractFromTheMiddle_thenReturnStringFromTheMiddle() {
		assertEquals("def", StringUtils.substring("abcdef", 3));
	}

	@Test
	void givenSubstringJustWithTheBegining_whenSubstractLastCharacter_thenReturnLastCharacter() {
		assertEquals("f", StringUtils.substring("abcdef", 5));
	}

	@Test
	void givenSubstringJustWithTheBegining_whenSubstractAfterTheEnd_thenReturnEmptyString() {
		assertEquals("", StringUtils.substring("abcdef", 20));
	}

	@Test
	void givenSubstringJustWithTheBegining_whenSubstractNull_thenReturnEmptyString() {
		assertEquals("", StringUtils.substring(null, 0));
	}

	@Test
	void givenSubstringJustWithTheBegining_whenSubstractEmptyString_thenReturnEmptyString() {
		assertEquals("", StringUtils.substring("", 0));
	}

}