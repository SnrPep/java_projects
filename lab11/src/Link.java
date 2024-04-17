import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Link {
    private static final Pattern REFERENCE_PATTERN = Pattern.compile(
            "^\\s*?(?<authors>[А-Яа-яёЁ\\s\\.,]+)\\s*\\((?<year>\\d{4})\\)\\.?\\s*(?<title>[^()]+)\\s*\\.\\s*(?<pages>\\d+-\\d+)\\s*(?:(?<journal>[^()]+)\\((?<volume>\\d+)\\)\\s*(?<issue>\\d+)|In\\s*(?<editors>[^()]+)\\(Eds?\\.\\),\\s*(?<book>[^().]+)(?:\\s*(?<series>[^()]+)\\s*vol\\.\\s*(?<volumeNumber>\\d+)\\s*no\\.\\s*(?<issueNumber>\\d+))?)\\s*(?:Retrieved|Paper presented)?\\s*?$",
            Pattern.UNICODE_CHARACTER_CLASS);

    public static boolean isReference(String text) {
        Matcher matcher = REFERENCE_PATTERN.matcher(text);
        return matcher.matches();
    }
}
