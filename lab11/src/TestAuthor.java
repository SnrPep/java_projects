import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestAuthor {
    public static void main(String[] args) {
        String filePath = "src/File.txt";

        try {
            String articleText = new String(Files.readAllBytes(Paths.get(filePath)), "windows-1251");

            List<Author> authors = AuthorManager.findAuthorsInText(articleText);

            AuthorManager.saveAuthorsToFile(authors, "authors.ser");

            List<Author> readAuthors = AuthorManager.readAuthorsFromFile("authors.ser");

            for (Author author : readAuthors) {
                if (author.getLastName().matches("[A-Z][a-z]+")) {
                    System.out.println(author);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}