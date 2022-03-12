package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                        if (item.sellIn <= 0) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }

                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;

                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn <= 0) {
                            item.quality = 0;
                        }


                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    System.out.println("do nothing");
                    break;
                default:
                    item.updateItem();
                    break;
            }

            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                System.out.println("do nothing");
            } else {
                item.sellIn = item.sellIn - 1;
            }

        }
    }
}
