package adaptparameter;

import jakarta.servlet.http.HttpServletRequest;

public record HttpServletParameters(HttpServletRequest request) implements Parameters {

    @Override
    public String[] getParameterValues(String s) {
        return request.getParameterValues(s);
    }
}