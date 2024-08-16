package replaceglobalreferencewithgetter;

import java.util.List;

public class EmployeeService {

    public List<String> findAll() {
        var employees = EmployeeRepository.getInstance().findAll();
        return employees.stream().map(String::toUpperCase).toList();
    }
}
