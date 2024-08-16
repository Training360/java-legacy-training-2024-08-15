package parameterizeconstructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService employeeService;

    @Test
    void findAll() {
        when(employeeRepository.findAll()).thenReturn(List.of("Jane Doe", "John Doe"));
        var employees = employeeService.findAll();
        assertEquals(List.of("JANE DOE", "JOHN DOE"), employees);
    }
}