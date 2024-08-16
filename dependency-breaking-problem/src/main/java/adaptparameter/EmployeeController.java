package adaptparameter;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    public void listEmployeesByIds(HttpServletRequest request) {
        var ids = Arrays.stream(request.getParameterValues("ids")).map(Integer::parseInt).toList();
        employeeService.findAll(ids);
    }
}
