package pushdowndependency;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BasketController {

    private ReadWriteBasket basket;

    public void addItem(String item) {
        basket.addItem(item);
    }

    public void editItem(String item, String newItem) {
        basket.editItem(item, newItem);
    }

    public List<String> getDottedItems() {
        return basket.getDottedItems();
    }
}
