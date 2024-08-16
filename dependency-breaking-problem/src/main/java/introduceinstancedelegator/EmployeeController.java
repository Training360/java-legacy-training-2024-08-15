package introduceinstancedelegator;

import exceptions.CanNotRunInTestException;
import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    public String sayHello(String name) {
        String message = "Hello %s!".formatted(name);
        sendHelloMessage(message);
        return message;
    }

    private static void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        throw new CanNotRunInTestException();
    }

    void sendHelloMessage(String message) {
        EmployeeController.sendMessage(message);
    }

}
