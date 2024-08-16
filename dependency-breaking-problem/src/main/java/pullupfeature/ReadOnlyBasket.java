package pullupfeature;

import java.util.List;

public class ReadOnlyBasket {

    private static final int MAX_LENGTH = 8;

    private static final String PLACEHOLDER = "...";


    protected List<String> items;

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
