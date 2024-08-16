package subclassandoverridemethod;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeServiceTest {

    @Test
    void findUpperCasedEmployees() {
//        var employeeService = new EmployeeService() {
//            @Override
//            List<String> findEmployees() {
//                return List.of("John Doe", "Jane Doe");
//            }
//        };
        var employeeService = spy(new EmployeeService());
//        when(employeeService.findEmployees()).thenReturn(List.of("John Doe", "Jane Doe"));
        doReturn(List.of("John Doe", "Jane Doe")).when(employeeService).findEmployees();

        System.out.println(employeeService.findEmployees());

        var result = employeeService.findUpperCasedEmployees();
        assertEquals(List.of("JOHN DOE", "JANE DOE"), result);
    }
}