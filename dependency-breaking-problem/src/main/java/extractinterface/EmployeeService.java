package extractinterface;

import java.util.List;

public class EmployeeService {

    public List<String> readEmployees(CsvEmployeesFile csvEmployeesFile) {
        return csvEmployeesFile.readEmployees();
    }
}
