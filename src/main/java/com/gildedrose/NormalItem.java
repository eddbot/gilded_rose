package com.gildedrose;

public class NormalItem extends PubItem {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    public void update() {
        updateQuality();
        updateSellIn();
     }

    private void updateQuality(){
        if(sellIn > 0) {
            quality -= 1;
        } else {
            quality -= 2;
        }

        if(quality < 0) {
            quality = 0;
        }
    }

    private void updateSellIn(){
        sellIn -= 1;
    }
}
