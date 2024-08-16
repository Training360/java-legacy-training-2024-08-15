package parameterizeconstructor;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService() {
        repository = new EmployeeRepository();
    }

    public List<String> findAll() {
        var employees = repository.findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
