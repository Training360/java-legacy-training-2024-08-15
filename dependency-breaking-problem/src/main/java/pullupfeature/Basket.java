package pullupfeature;

import java.util.ArrayList;
import java.util.List;

public class Basket extends ReadOnlyBasket {

    private ItemValidator itemValidator;

    public Basket() {
        items = new ArrayList<>(List.of("bread", "milk"));
        itemValidator = new ItemValidator();
    }

    public void addItem(String item) {
        itemValidator.validate(item);
    }

    public void editItem(String item, String newItem) {
        itemValidator.validate(newItem);
    }


    // ertwertwertwertwertwertw
    // weqrf...
}
