public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return this.value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        if (Character.compare(this.value, anotherCharacter.value) == 0){
            return 0;
        }
        else if (Character.compare(this.value, anotherCharacter.value) > 0){
            return 1;
        }
        else{
            return -1;
        }
    }

    public boolean equals(Object anotherCharacter) {
        if (this == anotherCharacter) {
            return true;
        }
        if (anotherCharacter == null || getClass() != anotherCharacter.getClass()) {
            return false;
        }
        MyCharacter that = (MyCharacter) anotherCharacter;
        return value == that.value;
    }

    public boolean isDigit() {
        return Character.isDigit(this.value);
    }

    public static boolean isDigit(MyCharacter ch) {
        return Character.isDigit(ch.value);
    }

    public static boolean isLetter(MyCharacter ch) {
        return Character.isLetter(ch.value);
    }

    public static boolean isLetterOrDigit(MyCharacter ch) {
        return Character.isLetterOrDigit(ch.value);
    }
}