package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {
    @Test
    void normal_item_should_inherit_from_item(){
        Item normalItem = new NormalItem("cool_item", 8, 10);

        assertEquals(8, normalItem.sellIn);
        assertEquals(10, normalItem.quality);
    }
}
