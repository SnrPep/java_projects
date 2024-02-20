public class TestMyCharacter {
    public static void main(String[] args) {

        MyCharacter myChar = new MyCharacter('A');
        System.out.println("Is digit: " + myChar.isDigit());
        System.out.println("Is letter: " + myChar.isLetter(myChar));
        System.out.println("Is letter or digit: " + myChar.isLetterOrDigit(myChar));

        MyCharacter anotherChar = new MyCharacter('B');
        System.out.println("Compare result: " + myChar.compareTo(anotherChar));
        System.out.println("Equals result: " + myChar.equals(anotherChar));
    }
}
