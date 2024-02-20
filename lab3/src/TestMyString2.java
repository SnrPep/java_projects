import java.util.Arrays;
public class TestMyString2 {
    public static void main(String[] args) {
        char[] charArray = {'G', 'o', 'o', 'd'};
        MyString2 MyString2 = new MyString2(charArray);

        System.out.println("Original String: " + Arrays.toString(MyString2.toChars()));

        MyString2 substring1 = MyString2.substring(1);
        System.out.println("Substring from index 1: " + Arrays.toString(substring1.toChars()));

        MyString2 substring2 = MyString2.substring(1, 2);
        System.out.println("Substring from index 1 to 2: " + Arrays.toString(substring2.toChars()));

        MyString2 anotherString = new MyString2(new char[]{ 'G','o', 'o', 't'});
        System.out.println("Equals result: " + MyString2.equals(anotherString));
        System.out.println("Compare result: " + MyString2.compareTo(anotherString));

        MyString2 booleanString = MyString2.valueOf(true);
        System.out.println("Boolean String: " + Arrays.toString(booleanString.toChars()));
    }
}
