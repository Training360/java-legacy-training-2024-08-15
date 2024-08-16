package breakoutmethodobject;

import lombok.AllArgsConstructor;

import java.nio.file.Path;

@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    public int summarize() {
        return employeeService.summarize(Path.of("employees.txt"));
    }
}
