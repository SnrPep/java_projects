import java.util.Arrays;

public class MyString2 {
    private char[] chars;

    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public MyString2 substring(int begin) {
        return substring(begin, chars.length);
    }

    public MyString2 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException();
        }
        int length = end - begin;
        char[] result = new char[length];
        System.arraycopy(chars, begin, result, 0, length);
        return new MyString2(result);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyString2 myString2 = (MyString2) obj;
        return Arrays.equals(chars, myString2.chars);
    }

    public int compareTo(MyString2 obj) {
        if (new String(chars).compareTo(new String(obj.chars)) == 0){
            return 0;
        }
        else if (new String(chars).compareTo(new String(obj.chars)) > 0){
            return 1;
        }
        else{
            return -1;
        }
    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(String.valueOf(b).toCharArray());
    }
}

