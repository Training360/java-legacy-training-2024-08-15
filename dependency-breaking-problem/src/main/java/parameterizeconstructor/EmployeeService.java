package parameterizeconstructor;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepository repository;

    /**
     * @deprecated
     * Use parametrized constructor.
     */
    @Deprecated(since = "1.0.0")
    public EmployeeService() {
        this(new EmployeeRepository());
    }

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<String> findAll() {
        var employees = repository.findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
