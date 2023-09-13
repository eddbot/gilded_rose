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
    void generic_item_quality_cannot_be_negative() {
        Item[] items = new Item[]{new Item("generic_item", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("generic_item", app.items[0].name);
        assertEquals(0, app.items[0].quality);
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

    // Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less
    @Test
    void backstage_passes_quality_increase_by_2_when_sell_in_is_10_days_or_less() {
        Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE_PASSES, 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES, app.items[0].name);
        assertEquals(2, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void backstage_passes_quality_increase_by_3_when_sell_in_is_5_days_or_less() {
        Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE_PASSES, 5, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES, app.items[0].name);
        assertEquals(3, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
    }

    @Test
    void backstage_passes_quality_is_0_when_sell_in_is_reached() {
        Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE_PASSES, 0, 1000)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES, app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void sulfuras_being_a_legendary_item_never_has_to_be_sold_or_decreases_in_quality() {
        Item[] items = new Item[]{new Item(GildedRose.SULFURAS, 0, 1000)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(GildedRose.SULFURAS, app.items[0].name);
        assertEquals(1000, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

}
