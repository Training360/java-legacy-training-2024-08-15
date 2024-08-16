package parameterizemethod;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeFile employeeFile;

    @Test
    void findAll() {
        when(employeeFile.readNames()).thenReturn(
                List.of("John Doe", "Jack Doe"));
        var employeeService = new EmployeeService();
        var employees = employeeService.findAll(employeeFile);
        assertEquals(List.of("JOHN DOE", "JACK DOE"), employees);
    }
}