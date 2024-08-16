package primitivizeparameter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TotalPriceTest {

    @Test
    void calculateOnPrices() {
        var items = List.of(new Price(12), new Price(15));
        var result = new TotalPrice().calculateOnPrices(items);
        assertEquals(result, 27);
    }
}