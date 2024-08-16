package exposestaticmethod;

import java.util.List;

public class EmployeeRepository {

    public List<String> findAll() {
        return List.of("Jack Doe", "John Doe");
    }
}
