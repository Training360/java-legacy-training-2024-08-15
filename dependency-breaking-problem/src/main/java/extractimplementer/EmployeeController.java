package extractimplementer;

import java.nio.file.Path;
import java.util.List;

public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<String> readEmployees() {
        return employeeService.readEmployees(new EmployeesFile(Path.of("employees.csv")));
    }
}
