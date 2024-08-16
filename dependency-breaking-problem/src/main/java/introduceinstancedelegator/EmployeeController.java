package introduceinstancedelegator.problem;

import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    public String sayHello(String name) {
        String message = "Hello %s!".formatted(name);
        sendMessage(message);
        return message;
    }

    private static void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        throw new IllegalStateException("Can not send message");
    }

}
