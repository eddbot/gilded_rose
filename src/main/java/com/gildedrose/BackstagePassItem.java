package com.gildedrose;

public class BackstagePassItem extends PubItem {
    public BackstagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();

    }

    private void updateQuality() {

        if (sellIn <= 0) {
            quality = 0;
            return;
        }

        int qualityToAdd = 0;

        if (sellIn <= 10) {
            qualityToAdd = 2;
        }

        if (sellIn <= 5) {
            qualityToAdd = 3;
        }

        quality += qualityToAdd;
    }

    private void updateSellIn() {
        sellIn -= 1;

    }
}
