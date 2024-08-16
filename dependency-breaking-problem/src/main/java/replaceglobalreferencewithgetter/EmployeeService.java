package replaceglobalreferencewithgetter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EmployeeService {

    public List<String> findAll() {
        var employees = getInstance().findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }

    EmployeeRepository getInstance() {
        return EmployeeRepository.getInstance();
    }


}
