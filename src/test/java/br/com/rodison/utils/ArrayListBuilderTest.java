package br.com.rodison.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ArrayListBuilderTest {

    @Test
    void testAdd() {
        List<String> listItem = ArrayListBuilder.<String>builder().add("item").build();
        Assertions.assertEquals(1, listItem.size());
        Assertions.assertEquals("item", listItem.get(0));
    }

    @Test
    void testAdd_withList() {
        List<String> listItem = ArrayListBuilder.<String>builder().add("item").build();
        List<String> listItem2 = ArrayListBuilder.builder(listItem).add("item2").build();
        Assertions.assertEquals(2, listItem2.size());
        Assertions.assertEquals("item", listItem2.get(0));
        Assertions.assertEquals("item2", listItem2.get(1));
    }

}
