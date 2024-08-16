package extractandoverridecall;

import jakarta.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

public class EmployeeController {

    @Getter
    @Setter
    private String name;

    public String sayHello() {
        String message = "Hello %s".formatted(name);

        extracted();

        return "/hello.xhtml?faces-redirect=true";
    }

    void extracted() {
        Random random = new Random();
        for (;;) {
            if (random.nextInt(1000) == 10) {
                break;
            }
        }
    }

}
