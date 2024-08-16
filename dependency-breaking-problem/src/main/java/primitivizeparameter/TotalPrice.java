package primitivizeparameter;

import java.util.List;

public class TotalPrice {

    public int calculate(List<BasketItem> items) {
        return items.stream().mapToInt(BasketItem::getPrice).sum();
    }
}
