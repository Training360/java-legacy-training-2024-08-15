package parameterizemethod;

import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public List<String> findAll() {
        var file = new EmployeeFile(Path.of("employees.txt"));
        var employees = file.readNames();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
