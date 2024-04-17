import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthorManager {

    public static void saveAuthorsToFile(List<Author> authors, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(authors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Author> readAuthorsFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Author>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static List<Author> findAuthorsInText(String text) {
        List<Author> authors = new ArrayList<>();
        Pattern pattern = Pattern.compile("([А-ЯЁ][а-яё]+) ([А-ЯЁ]\\.[А-ЯЁ]\\.)");
        Matcher matcher = pattern.matcher(text);
        Pattern pattern1 = Pattern.compile("([A-Z][a-z]+) ([A-Z]\\.[A-Z]\\.)");
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher.find() || matcher1.find()) {
            String lastName = matcher.group(1);
            String initials = matcher.group(2);
            authors.add(new Author(lastName, initials));
        }
        return authors;
    }
}