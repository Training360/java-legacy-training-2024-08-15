package pushdowndependency;

import exceptions.CanNotRunInTestException;

public class ItemValidator {

    public ItemValidator() {
        throw new CanNotRunInTestException();
    }

    public boolean validate(String item) {
        return true;
    }
}
