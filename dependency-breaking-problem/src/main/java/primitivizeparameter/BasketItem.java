package primitivizeparameter;

import exceptions.CanNotRunInTestException;
import lombok.Value;

@Value
public class BasketItem {

    public BasketItem() {
        throw new CanNotRunInTestException();
    }

    private String product;

    private int price;
}
