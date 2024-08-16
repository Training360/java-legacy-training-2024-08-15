package breakoutmethodobject;

import exceptions.CanNotRunInTestException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public EmployeeService() {
        throw new CanNotRunInTestException();
    }

    public int summarize(Path file) {
        List<String> lines = getLines(file);
        int sum = 0;
        for (var line: lines) {
            var value = Integer.parseInt(line.split(",")[1]);
            sum += value;
        }
        return sum;
    }

    private List<String> getLines(Path file) {
        return new EmployeesFile(file).getLines();
    }
}
