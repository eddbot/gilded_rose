package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasItemTest {
    @Test
    void sulfuras_item_should_inherit_from_item(){
        Item sulfurasItem = new SulfuraslItem(GildedRose.SULFURAS, 10, 80);

        assertEquals(10, sulfurasItem.sellIn);
        assertEquals(80, sulfurasItem.quality);
    }
}
