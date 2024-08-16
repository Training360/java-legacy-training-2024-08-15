package encapsulateglobalreferences;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LogMessageFilter {

    private final EmployeeController employeeController;

    public String sayHello(String name) {
        return employeeController.sayHello(name);
    }
}
