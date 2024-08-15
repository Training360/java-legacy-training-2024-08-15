package employees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeesRepository;

    @InjectMocks
    EmployeeService employeesService;

    @Test
    void shouldNotPersistExistingEmployee() {
        when(employeesRepository.exitsEmployee(any())).thenReturn(true);
        employeesService.createEmployee(new Employee(null, "John Doe", 1970));
        verify(employeesRepository, never()).createEmployee(any());
    }

    @Test
    void shouldReturnAllEmployees() {
        when(employeesRepository.findAllEmployees()).thenReturn(
                List.of(new Employee(1L, "John Doe", 1970),
                        new Employee(2L, "Jack Doe", 1980))
        );

        var employees = employeesService.findAllEmployees();

        assertThat(employees)
                .extracting(Employee::getName, Employee::getYearOfBirth)
                .containsExactly(tuple("John Doe", 1970),
                        tuple("Jack Doe", 1980));

        assertThat("John Doe")
                .startsWith("John");
    }
}
