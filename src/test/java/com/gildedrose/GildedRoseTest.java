package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void generic_item_sell_in_decrements_by_one() {
        Item[] items = new Item[]{new Item("generic_item", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("generic_item", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void generic_item_quality_degrades_by_one_when_sell_in_not_reached() {
        Item[] items = new Item[]{new Item("generic_item", 3, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("generic_item", app.items[0].name);
        assertEquals(9, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }

    @Test
    void generic_item_quality_degrades_by_two_when_sell_in_reached() {
        Item[] items = new Item[]{new Item("generic_item", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("generic_item", app.items[0].name);
        assertEquals(8, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }


    @Test
    void aged_brie_quality_increases_by_one_when_sell_in_not_reached() {
        Item[] items = new Item[]{new Item(GildedRose.AGED_BRIE, 1, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.items[0].name);
        assertEquals(2, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void aged_brie_quality_increases_by_two_when_sell_in_reached() {
        Item[] items = new Item[]{new Item(GildedRose.AGED_BRIE, 0, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.items[0].name);
        assertEquals(3, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }
    @Test
    void aged_brie_quality_cannot_go_above_50() {
        Item[] items = new Item[]{new Item(GildedRose.AGED_BRIE, 0, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.items[0].name);
        assertEquals(50, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }
}
