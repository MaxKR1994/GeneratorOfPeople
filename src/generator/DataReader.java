package generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DataReader {
    public static Set<String> readData(String fileName) {
        Set<String> data = new HashSet<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(data::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
