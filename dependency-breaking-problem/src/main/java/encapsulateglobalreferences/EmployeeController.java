package encapsulateglobalreferences;

import jakarta.faces.context.FacesContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeController {

    public String sayHello(String name) {
        String message = "Hello %s!".formatted(name);
        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .put("message",
                        message);
        return "/hello.xhtml?faces-redirect=true";
    }

}
