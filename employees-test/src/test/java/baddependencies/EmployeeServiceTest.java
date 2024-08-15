package baddependencies;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class EmployeeServiceTest {

    @Test
    void shouldNotPersistExistingEmployee() {
        EmployeeRepository mockEmployeeRepository = mock(EmployeeRepository.class);

//        EmployeeService employeeService = spy(new EmployeeService());
//
//        when(employeeService.getEmployeeRepository()).thenReturn(mockEmployeeRepository);

        EmployeeService employeeService = new EmployeeService(){
            @Override
            EmployeeRepository getEmployeeRepository() {
                return mockEmployeeRepository;
            }
        };

        when(mockEmployeeRepository.exitsEmployee(any())).thenReturn(true);

        employeeService.createEmployee(new Employee(1L, "John Doe", 1970));

        verify(mockEmployeeRepository, never()).createEmployee(any());
    }
}
