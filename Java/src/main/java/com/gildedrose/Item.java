package com.gildedrose;

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

    private void updateQuality() {
        if (quality > 0) {
            quality--;
        }
        if (sellIn <= 0) {
            if (quality > 0) {
                quality--;
            }
        }
    }

    private void updateSellIn() {
        sellIn--;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
