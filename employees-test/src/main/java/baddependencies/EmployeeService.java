package baddependencies;

import org.jetbrains.annotations.VisibleForTesting;

import java.util.List;

public class EmployeeService {

    public void createEmployee(Employee employee) {
        EmployeeRepository employeeRepository = getEmployeeRepository();
        if (!employeeRepository.exitsEmployee(employee.getName())) {
            employeeRepository.createEmployee(employee);
        }
    }

    @VisibleForTesting
    EmployeeRepository getEmployeeRepository() {
        return new EmployeeRepository();
    }

    public List<Employee> findAllEmployees() {
        EmployeeRepository employeeRepository = getEmployeeRepository();
        return employeeRepository.findAllEmployees();
    }
}
