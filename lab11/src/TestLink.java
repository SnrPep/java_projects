import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestLink {
    public static void main(String[] args) throws IOException {
        String fileName = "src\\File.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + " is a reference: " + Link.isReference(line));
            }
        }
    }
}
