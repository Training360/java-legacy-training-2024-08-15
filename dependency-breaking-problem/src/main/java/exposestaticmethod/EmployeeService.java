package exposestaticmethod;

import exceptions.CanNotRunInTestException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    public EmployeeService() {
        throw new CanNotRunInTestException();
    }

    // Probléma: nem lehet példányosítani
    // Megoldás: legyen statikus metódus
    public String sayHello(String name) {
        return "Hello %s!".formatted(name);
    }

    public List<String> findAll() {
        return employeeRepository.findAll();
    }
}
