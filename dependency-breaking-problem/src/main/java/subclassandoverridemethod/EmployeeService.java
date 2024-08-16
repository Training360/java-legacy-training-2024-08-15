package subclassandoverridemethod;

import lombok.SneakyThrows;
import org.assertj.core.util.VisibleForTesting;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public List<String> findUpperCasedEmployees() {
        return findEmployees().stream().map(String::toUpperCase).toList();
    }

    @SneakyThrows
    @VisibleForTesting
    List<String> findEmployees() {
        return Files.readAllLines(Path.of("employees.txt"));
    }


}
