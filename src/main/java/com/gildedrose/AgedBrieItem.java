package com.gildedrose;

public class AgedBrieItem extends PubItem {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();
    }

    private void updateQuality() {

        if(sellIn > 0) {
            quality += 1;
        } else {
            quality += 2;
        }

        if(quality > 50) {
            quality = 50;
        }

    }

    private void updateSellIn() {
        sellIn -= 1;
    }
}
