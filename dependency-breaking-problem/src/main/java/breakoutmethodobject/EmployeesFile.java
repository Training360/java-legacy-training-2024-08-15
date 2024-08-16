package breakoutmethodobject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeesFile {

    private Path file;

    public EmployeesFile(Path file) {
        this.file = file;
    }

    public List<String> getLines(Path file) {
        List<String> lines;
        try {
            lines = readLines();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return lines;
    }

    public List<String> readLines() throws IOException {
        return Files.readAllLines(file);
    }
}
