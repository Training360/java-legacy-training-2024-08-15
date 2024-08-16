package exceptions;

public class CanNotRunInTestException extends RuntimeException {
    public CanNotRunInTestException() {
        super("Demonstrate that code can not run in a test");
    }
}
