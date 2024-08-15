package weather;

import org.junit.jupiter.api.Test;

import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherFileTest {

    @Test
    void shouldReturnDay22() {
        var day = new WeatherFile().findDayWithMinimumTemperatureDifference(
                new InputStreamReader(WeatherFileTest.class.getResourceAsStream("/weather.dat")));
        assertEquals(14, day);
    }
}
