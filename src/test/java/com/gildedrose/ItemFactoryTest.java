package com.gildedrose;

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

    @Test
    void returns_aged_brie_as_required(){

        // arrange
        String itemName = GildedRose.AGED_BRIE;

        // act
        Item item = ItemFactory.create(itemName, 10, 10);

        // assert
        assertEquals("AgedBrieItem", item.getClass().getSimpleName());
        assertEquals(10, item.quality);
        assertEquals(10, item.sellIn);
    }

    @Test
    void returns_backstage_passes_as_required(){

        // arrange
        String itemName = GildedRose.BACKSTAGE_PASSES;

        // act
        Item item = ItemFactory.create(itemName, 10, 10);

        // assert
        assertEquals("BackstagePassItem", item.getClass().getSimpleName());
        assertEquals(10, item.quality);
        assertEquals(10, item.sellIn);
    }

    @Test
    void returns_sulfuras_as_required(){

        // arrange
        String itemName = GildedRose.SULFURAS;

        // act
        Item item = ItemFactory.create(itemName, 10, 80);

        // assert
        assertEquals("SulfurasItem", item.getClass().getSimpleName());
        assertEquals(80, item.quality);
        assertEquals(10, item.sellIn);
    }
}
