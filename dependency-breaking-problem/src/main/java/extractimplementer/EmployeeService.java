package extractimplementer;

import java.util.List;

public class EmployeeService {

    public List<String> readEmployees(EmployeesFile employeesFile) {
        return employeesFile.readEmployees();
    }
}
