package com.gildedrose;

public abstract class PubItem extends Item implements Updater{
    public PubItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException();
    }
}
