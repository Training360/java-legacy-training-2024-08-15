package breakoutmethodobject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public int summarize(Path file) {
        List<String> lines;
        try {
            lines = Files.readAllLines(file);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        int sum = 0;
        for (var line: lines) {
            var value = Integer.parseInt(line.split(",")[1]);
            sum += value;
        }
        return sum;
    }
}
