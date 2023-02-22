package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import static br.com.rodison.utils.DateTimeUtils.localDateTimeToDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtils_ObjectToJsonTest {

    @Test
    void givenNull_thenReturnEmptyString() {
        assertEquals("", StringUtils.objectToJson(null));
    }

    @Test
    void givenString_thenReturnStringEnclosedInQuotes() {
        assertEquals("\"abc\"", StringUtils.objectToJson("abc"));
    }

    @Test
    void givenInteger_thenReturnIntegerInString() {
        assertEquals("123", StringUtils.objectToJson(123));
    }

    @Test
    void givenDto_thenReturnDtoInJson() {
        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.FEBRUARY, 21, 22, 03, //
                01, 333);
        ObjectToJsonTestDto dto = ObjectToJsonTestDto.builder()
                .withStringField("abc")
                .withIntegerField(123)
                .withBooleanField(true)
                .withBigDecimalField(new BigDecimal("12345.67"))
                .withDateField(localDateTimeToDate(localDateTime))
                .withLocalDateTimeField(localDateTime)
                .build();
        String jsonExcepted = "{\"stringField\":\"abc\",\"integerField\":123,\"bigDecimalField\":12345.67,"
                + "\"booleanField\":true,\"dateField\":1677027781000,\"localDateTimeField\":[2023,2,21,22,3,1,333]}";
        assertEquals(jsonExcepted, StringUtils.objectToJson(dto));
    }

    // NAO CONSEGUI FAZER UM TESTE ONDE O objectToJson DAH UMA EXCEPTION

}