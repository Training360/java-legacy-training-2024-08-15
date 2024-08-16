package adaptparameter;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    public void listEmployeesByIds(Parameters parameters) {
        var ids = Arrays.stream(parameters.getParameterValues("ids")).map(Integer::parseInt).toList();
        employeeService.findAll(ids);
    }
}
