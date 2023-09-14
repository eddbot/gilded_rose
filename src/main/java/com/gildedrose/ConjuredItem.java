package com.gildedrose;

public class ConjuredItem extends PubItem{
    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        updateQuality();
        updateSellIn();
    }


    private void updateQuality() {
        if(sellIn > 0) {
            quality -= 2;
        } else {
            quality -= 4;
        }

        if(quality < 0) {
            quality = 0;
        }

    }

    private void updateSellIn() {
        sellIn -= 1;
    }

}
