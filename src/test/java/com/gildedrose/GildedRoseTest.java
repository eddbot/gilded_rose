package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void generic_item_sell_in_decrements_by_one() {
        Item[] items = new Item[] { new Item("generic_item", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("generic_item", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

}
