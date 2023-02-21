package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtils_TrimTest {

    @Test
    void givenTrim_whenAStringWith1SpaceIsPassed_thenReturnAnEmptyString() {
        assertEquals("".trim(), StringUtils.trim(" "));
    }

    @Test
    void givenTrim_whenAStringWith3SpacesIsPassed_thenReturnAnEmptyString() {
        assertEquals("", StringUtils.trim("   "));
    }

    @Test
    void givenTrim_whenAnEmptyStringIsPassed_thenReturnAnEmptyString() {
        assertEquals("", StringUtils.trim(""));
    }

    @Test
    void givenTrim_whenNullIsPassed_thenReturnAnEmptyString() {
        assertEquals("", StringUtils.trim(null));
    }

    @Test
    void givenTrim_whenAStringWith3SpacesInTheBeginingIsPassed_thenReturnTheStringWithoutTheSpacesInTheBegining() {
        assertEquals("abc", StringUtils.trim("   abc"));
    }

    @Test
    void givenTrim_whenAStringWith3SpacesInTheEndIsPassed_thenReturnTheStringWithoutTheSpacesInTheEnd() {
        assertEquals("abc", StringUtils.trim("abc   "));
    }

    @Test
    void givenTrim_whenAStringWith3SpacesInTheBeginingAndInTheEndIsPassed_thenReturnTheStringWithoutTheSpacesInTheBeginingAndInTheEnd() {
        assertEquals("abc", StringUtils.trim("   abc   "));
    }

}