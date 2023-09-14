package com.gildedrose;

public class ItemFactory {
    public static PubItem create(String name, int sellIn, int quality) {

        switch (name) {
            case GildedRose.AGED_BRIE:
                return new AgedBrieItem(name, sellIn, quality);
            case GildedRose.BACKSTAGE_PASSES:
                return new BackstagePassItem(name, sellIn, quality);
            case GildedRose.SULFURAS:
                return new SulfurasItem(name, sellIn, quality);
            case GildedRose.CONJURED_ITEM:
                return new ConjuredItem(name, sellIn, quality);
            default:
                return new NormalItem(name, sellIn, quality);
        }
    }
}
