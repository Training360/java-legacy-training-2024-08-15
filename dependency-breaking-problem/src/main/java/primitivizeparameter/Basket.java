package primitivizeparameter;

import java.util.List;

public class Basket {

    private List<BasketItem> items;

    public int calculate() {
        var totalPrice = new TotalPrice();
        return totalPrice.calculate(items);
    }
}
