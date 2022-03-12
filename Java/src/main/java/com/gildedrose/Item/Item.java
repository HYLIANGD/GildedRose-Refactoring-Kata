package com.gildedrose.Item;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateItem() {
        updateQuality();
        updateSellIn();
    }

    protected void updateQuality() {
        if (quality > 0) {
            quality--;
        }
        if (sellIn <= 0) {
            if (quality > 0) {
                quality--;
            }
        }
    }

    protected void updateSellIn() {
        sellIn--;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
