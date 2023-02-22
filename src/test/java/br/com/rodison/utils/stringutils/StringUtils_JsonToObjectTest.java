package br.com.rodison.utils.stringutils;

import br.com.rodison.utils.StringUtils;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.Month;

import static br.com.rodison.utils.DateTimeUtils.localDateTimeToDate;
import static org.junit.jupiter.api.Assertions.*;

class StringUtils_JsonToObjectTest {

    @Test
    void givenNull_thenReturnNull() {
        assertNull(StringUtils.jsonToObject(null, ObjectToJsonTestDto.class));
    }

    @Test
    void givenEmptyString_thenReturnNull() {
        assertNull(StringUtils.jsonToObject("", ObjectToJsonTestDto.class));
    }

    @Test
    void givenInvalidJson_thenThrowError() {
        try {
            StringUtils.jsonToObject("abc", ObjectToJsonTestDto.class);
            fail("erro no teste");
        } catch (Exception e) {
            assertEquals("Cant convert json to object. Original json: abc - dtoClass: " //
                    + ObjectToJsonTestDto.class, e.getMessage());
        }
    }

    @Test
    void givenJson_thenReturnDto() {
        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.FEBRUARY, 21, 22, 03, //
                01, 333);
        String json = "{\"stringField\":\"abc\",\"integerField\":123,\"bigDecimalField\":12345.67,"
                + "\"booleanField\":true,\"dateField\":1677027781000,\"localDateTimeField\":[2023,2,21,22,3,1,333]}";
        ObjectToJsonTestDto dto = StringUtils.jsonToObject(json, ObjectToJsonTestDto.class);
        assertEquals("abc", dto.getStringField());
        assertEquals(123, dto.getIntegerField());
        assertEquals(true, dto.isBooleanField());
        assertEquals(new BigDecimal("12345.67").setScale(2, RoundingMode.HALF_UP), dto.getBigDecimalField());
        assertEquals(localDateTime, dto.getLocalDateTimeField());
        assertEquals(localDateTimeToDate(localDateTime), dto.getDateField());
    }

}