package com.gildedrose;

import com.gildedrose.Item.Item;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateItem();
        }
    }
}
