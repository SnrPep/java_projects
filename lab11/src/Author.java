import java.io.Serializable;

public class Author implements Serializable {
    private String lastName;
    private String initials;

    public Author(String lastName, String initials) {
        this.lastName = lastName;
        this.initials = initials;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitials() {
        return initials;
    }

    @Override
    public String toString() {
        return lastName + " " + initials;
    }
}
