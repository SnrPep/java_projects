public class GenericStackTest {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        System.out.println("Стек пустой " + stack.isEmpty());

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println(stack.toString());

        System.out.println("Размер стека: " + stack.getSize());

        System.out.println("Верхний элемент стека: " + stack.peek());

        System.out.println("Удаленный элемент: " + stack.pop());

        System.out.println("Размер стека после удаления: " + stack.getSize());

        System.out.println("Стек пустой " + stack.isEmpty());

        System.out.println(stack.toString());
    }
}