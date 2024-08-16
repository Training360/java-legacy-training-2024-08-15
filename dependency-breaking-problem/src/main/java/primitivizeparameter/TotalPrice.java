package primitivizeparameter;

import java.util.List;

public class TotalPrice {

    public int calculate(List<BasketItem> items) {
        return calculateOnPrices(items.stream().map(item -> new Price(item.getPrice())).toList());
    }

    public int calculateOnPrices(List<Price> items) {
        return items.stream().mapToInt(Price::value).sum();
    }
}
