package br.com.rodison.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class HashMapBuilderTest {

    @Test
    void testBuilder() {
        Map<String, Integer> map = HashMapBuilder.<String, Integer>builder().put("key1", 1).build();
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.get("key1"));
    }

    @Test
    void testBuilder_withMap() {
        Map<String, Integer> map = HashMapBuilder.<String, Integer>builder().put("key1", 1).build();
        Map<String, Integer> map2 = HashMapBuilder.builder(map).put("key2", 2).build();
        Assertions.assertEquals(2, map2.size());
        Assertions.assertEquals(1, map2.get("key1"));
        Assertions.assertEquals(2, map2.get("key2"));
    }
}
