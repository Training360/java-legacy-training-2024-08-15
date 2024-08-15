package baddependencies;

import java.util.List;

public class EmployeeRepository {

    public void createEmployee(Employee employee) {
        System.out.println("Persist employee");
    }

    public boolean exitsEmployee(String name) {
        return false;
    }

    public List<Employee> findAllEmployees() {
        return List.of();
    }

}
