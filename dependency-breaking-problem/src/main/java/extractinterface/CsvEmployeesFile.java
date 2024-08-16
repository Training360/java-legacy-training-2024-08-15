package extractinterface;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@AllArgsConstructor
public class CsvEmployeesFile implements EmployeesFile {

    private Path path;

    @Override
    @SneakyThrows
    public List<String> readEmployees() {
        return Files.readAllLines(path);
    }
}
