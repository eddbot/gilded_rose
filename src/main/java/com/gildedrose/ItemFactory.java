package com.gildedrose;

public class ItemFactory {
    public static Item create(String name, int sellIn, int quality) {
        return new NormalItem(name, sellIn, quality);
    }
}
