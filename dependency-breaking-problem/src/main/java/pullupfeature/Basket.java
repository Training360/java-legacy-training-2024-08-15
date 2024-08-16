package pullupfeature;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private static final int MAX_LENGTH = 8;

    private static final String PLACEHOLDER = "...";

    private List<String> items;

    private ItemValidator itemValidator;

    public Basket() {
        items = new ArrayList<>(List.of("bread", "milk"));
        itemValidator = new ItemValidator();
    }

    public void addItem(String item) {
        itemValidator.validate(item);
    }

    public void editItem(String item, String newItem) {
        itemValidator.validate(item);
    }

    public List<String> getDottedItems() {
        return items.stream().map(this::dotted).toList();
    }

    private String dotted(String s) {
        if (s.length() - PLACEHOLDER.length() > MAX_LENGTH) {
            return s.substring(0, MAX_LENGTH - 3) + PLACEHOLDER;
        }
        else {
            return s;
        }
    }
}
