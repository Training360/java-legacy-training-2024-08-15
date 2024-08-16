package adaptparameter;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LogRequestFilter {

    private EmployeeController employeeController;

    public void doChain(HttpServletRequest request) {
        System.out.println(request.getHeader("RequestId"));
        employeeController.listEmployeesByIds(request);
    }
}
