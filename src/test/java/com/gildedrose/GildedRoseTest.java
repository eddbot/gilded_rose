package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void generic_item() {
        Item[] items = new Item[] { new Item("generic_item", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("generic_item", app.items[0].name);
    }

}
