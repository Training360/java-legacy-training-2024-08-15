package extractimplementer;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@AllArgsConstructor
public class EmployeesFile {

    private Path path;

    @SneakyThrows
    public List<String> readEmployees() {
        return Files.readAllLines(path);
    }
}
