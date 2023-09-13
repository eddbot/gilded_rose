package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassItemTest {
    @Test
    void backstage_pass_item_should_inherit_from_item(){
        Item backstagePassItem = new BackstagePassItem(GildedRose.BACKSTAGE_PASSES, 8, 10);

        assertEquals(8, backstagePassItem.sellIn);
        assertEquals(10, backstagePassItem.quality);
    }
}
