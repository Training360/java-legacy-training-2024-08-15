package extractandoverridecall;

import jakarta.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

public class EmployeeController {

    @Getter
    @Setter
    private String name;

    public String sayHello() {
        String message = "Hello %s".formatted(name);
        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .put("message",
                        message);
        return "/hello.xhtml?faces-redirect=true";
    }

}
