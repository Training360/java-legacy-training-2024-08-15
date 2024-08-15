package employees;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void createEmployee(Employee employee) {
        if (!employeeRepository.exitsEmployee(employee.getName())) {
            employeeRepository.createEmployee(employee);
        }
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAllEmployees();
    }
}
