import java.util.ArrayList;

public class GenericStTest {
    public static void main(String[] args) {
        GenericSt<String> stack = new GenericSt<>();
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Apple");
        items.add("Cherry");

        stack.without(items);
        System.out.println(stack);
    }
}