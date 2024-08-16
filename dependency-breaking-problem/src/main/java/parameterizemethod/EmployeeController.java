package parameterizemethod;

import java.nio.file.Path;
import java.util.List;

public class EmployeeController {

    private EmployeeService employeeService;

    public List<String> findAll() {
        return employeeService.findAll();
    }
}
