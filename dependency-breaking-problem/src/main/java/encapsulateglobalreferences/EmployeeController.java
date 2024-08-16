package encapsulateglobalreferences;

import jakarta.faces.context.FacesContext;
import lombok.AllArgsConstructor;

public class EmployeeController {

    private Messages messages;

    public EmployeeController(Messages messages) {
        this.messages = messages;
    }

    public EmployeeController() {
        this.messages = new Messages();
    }

    public String sayHello(String name) {
        String message = "Hello %s!".formatted(name);
        messages.setMessage(message);
        return "/hello.xhtml?faces-redirect=true";
    }

}
