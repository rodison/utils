package br.com.rodison.utils.stringutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtils_ReplaceTest {

	@Test
	void givenReplace_whenReplace1LetterToAnother_thenReturnTheStringWithTheLetterChangedToTheAnother() {
		assertEquals("aacaac", StringUtils.replace("abcabc", "b", "a"));
	}

	@Test
	void givenReplace_whenReplaceMoreThen1Letter_thenReturnTheStringWithTheSubstringChangedToTheAnother() {
		assertEquals("The night began and the night ended", StringUtils.replace("The day began and the day ended", "day", "night"));
	}

	@Test
	void givenReplace_whenReplaceByARegex_thenReturnTheStringWithTheSubstringChangedToTheRegex() {
		assertEquals("a day began and a day ended",
				StringUtils.replace("The day began and the day ended", "[tT]he", "a"));
	}

	@Test
	void givenReplace_whenStringNull_thenReturnAnEmptyString() {
		assertEquals("", StringUtils.replace(null, "b", "a"));
	}

	@Test
	void givenReplace_whenEmptyString_thenReturnAnEmptyString() {
		assertEquals("", StringUtils.replace("", "b", "a"));
	}

	@Test
	void givenReplace_whenExpressionToReplaceIsNull_thenReturnTheOriginalString() {
		assertEquals("abcabc", StringUtils.replace("abcabc", null, "a"));
	}

	@Test
	void givenReplace_whenExpressionToReplaceIsEmpty_thenReturnTheOriginalString() {
		assertEquals("abcabc", StringUtils.replace("abcabc", "", "a"));
	}

	@Test
	void givenReplace_whenReplaceByIsNull_thenReturnTheStringWhereTermsReplacedByAnEmptyString() {
		assertEquals("acac", StringUtils.replace("abcabc", "b", null));
	}

	@Test
	void givenReplace_whenReplaceByIsEmpty_thenReturnTheStringWhereTermsReplacedByAnEmptyString() {
		assertEquals("acac", StringUtils.replace("abcabc", "b", ""));
	}

}