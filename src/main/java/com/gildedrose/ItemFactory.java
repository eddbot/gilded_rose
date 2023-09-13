package com.gildedrose;

public class ItemFactory {
    public static Item create(String name, int sellIn, int quality) {

        switch (name) {
            case GildedRose.AGED_BRIE:
                return new AgedBrieItem(name, sellIn, quality);
            case GildedRose.BACKSTAGE_PASSES:
                return new BackstagePassItem(name, sellIn, quality);
            case GildedRose.SULFURAS:
                return new SulfurasItem(name, sellIn, quality);
            default:
                return new NormalItem(name, sellIn, quality);
        }
    }
}
