package pushdowndependency;

import java.util.ArrayList;
import java.util.List;

public class ReadWriteBasket extends Basket {

    private ItemValidator itemValidator;

    public ReadWriteBasket() {
        items = new ArrayList<>(List.of("bread", "milk"));
        itemValidator = new ItemValidator();
    }

    public void addItem(String item) {
        itemValidator.validate(item);
    }

    public void editItem(String item, String newItem) {
        itemValidator.validate(item);
    }


}
