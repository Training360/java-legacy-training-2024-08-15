package parameterizemethod;

import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public List<String> findAll() {
        var file = new EmployeeFile(Path.of("employees.txt"));
        return findAll(file);
    }

    public List<String> findAll(EmployeeFile file) {
        var employees = file.readNames();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
