package employees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void shouldReturnPositiveAge() {
        // Given
        var employee = new Employee(1L, "John Doe", 1970);
        // When
        var age = employee.getAge(2000);
        // Then
        assertEquals(30, age);
    }
}