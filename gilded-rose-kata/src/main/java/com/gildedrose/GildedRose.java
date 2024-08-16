package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateQualityOnItem(item);
        }
    }

    private void updateQualityOnItem(Item item) {
        UpdateQualityStrategy strategy = switch (item.name) {
            case "Aged Brie" ->
                new AgedBrieStrategy();
            case "Backstage passes to a TAFKAL80ETC concert" ->
                new BackstageStrategy();
            case "Sulfuras, Hand of Ragnaros" ->
                new SulfurasStrategy();
            default ->
                new DefaultStrategy();
        };
        strategy.updateOnItem(item);


    }
}
