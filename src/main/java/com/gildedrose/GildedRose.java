package com.gildedrose;

import java.util.Arrays;

class GildedRose {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED_ITEM = "Conjured Item";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        PubItem[] items = mapItems();

        for(PubItem item : items) {
            item.update();
        }

        this.items = items;
    }

    private PubItem[] mapItems() {
        return Arrays.stream(this.items)
            .map(item -> ItemFactory.create(item.name, item.sellIn, item.quality))
            .toArray(PubItem[]::new);
    }
}
