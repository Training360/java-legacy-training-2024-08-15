package encapsulateglobalreferences;

import jakarta.faces.context.FacesContext;

public class Messages {

    public void setMessage(String message) {
        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .put("message",
                        message);
    }

}
