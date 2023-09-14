package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemTest {
    @Test
    void normal_item_should_inherit_from_item(){
        Item normalItem = new ConjuredItem(GildedRose.CONJURED_ITEM, 8, 10);

        assertEquals(8, normalItem.sellIn);
        assertEquals(10, normalItem.quality);
    }
}
