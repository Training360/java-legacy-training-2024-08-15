package parameterizeconstructor;

import java.util.List;

public class EmployeeRepository {

    public EmployeeRepository() {
        throw new IllegalStateException("Not initialized");
    }

    public List<String> findAll() {
        return List.of();
    }
}
