package extractandoverridefactorymethod;

import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeFile {

    private List<String> lines;

    @SneakyThrows
    public EmployeeFile(Path path) {
        readLines(path);
    }

    void readLines(Path path) throws IOException {
        lines = Files.readAllLines(path);
    }

    public List<String> extractNames() {
        return lines.stream().map(s -> s.transform(EmployeeFile::onlyFirstPart)).toList();
    }

    public static String onlyFirstPart(String s) {
        return s.split(";")[0];
    }
}
