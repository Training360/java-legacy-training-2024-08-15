package introducestaticsetter;

import org.jetbrains.annotations.TestOnly;

import java.util.List;

public class EmployeeRepository {

    private static EmployeeRepository instance;

    public static EmployeeRepository getInstance() {
        if (instance != null) {
            return instance;
        }
        throw new IllegalStateException("Not initialized");
    }

    //@VisibleForTesting // privát lenne, de azért ,hogy a tesztből használhassukl, álllítjuk a láthatóságát
    @TestOnly // ez a metódus CSAK tesztből hívható
    public static void setInstance(EmployeeRepository instance) {
        EmployeeRepository.instance = instance;
    }

    public List<String> findAll() {
        return List.of();
    }
}
