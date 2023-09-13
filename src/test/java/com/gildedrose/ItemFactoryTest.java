package com.gildedrose;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemFactoryTest {
    @Test
    void returns_a_normal_item_as_default(){

        // arrange
        String itemName = "cool item!";

        // act
        Item item = ItemFactory.create(itemName, 10, 10);

        // assert
        assertEquals("NormalItem", item.getClass().getSimpleName());
        assertEquals(10, item.quality);
        assertEquals(10, item.sellIn);
    }
}
