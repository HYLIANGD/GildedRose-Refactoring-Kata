package com.gildedrose.Item;

public class AgedBrie extends Item{
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn <= 0) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }
}
