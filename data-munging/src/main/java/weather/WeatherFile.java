package weather;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Comparator;
import java.util.function.Predicate;

public class WeatherFile {

    public static final int NUMBER_OF_HEADER_LINES = 2;

    public int findDayWithMinimumTemperatureDifference(Reader reader) {
            return new BufferedReader(reader)
                    .lines()
                    .skip(NUMBER_OF_HEADER_LINES)
                    .filter(onlyDayLines())
                    .map(DayTemperatures::parse)
                    .min(Comparator.comparing(DayTemperatures::getDifference))
                    .map(DayTemperatures::day)
                    .orElseThrow(() -> new IllegalArgumentException("Can not find lines for days in file."));
    }

    private static Predicate<String> onlyDayLines() {
        return line -> !line.contains("mo");
    }
}
