package parameterizeconstructor;

import java.util.List;

public class EmployeeController {

    public List<String> findAll() {
        return new EmployeeService().findAll();
    }
}
