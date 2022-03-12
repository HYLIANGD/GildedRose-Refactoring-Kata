package com.gildedrose.Item;

public class Conjured extends Item{

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateSellIn() {
        sellIn = sellIn - 2;
    }
}
