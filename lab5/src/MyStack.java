import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "стек: " + list.toString();
    }

    @Override
    public MyStack clone() {
        try {
            MyStack clonedStack = (MyStack) super.clone();
            clonedStack.list = new ArrayList<>(list);
            return clonedStack;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");


        MyStack clonedStack = stack.clone();

        clonedStack.push("New Element");
        System.out.println("Original stack: " + stack);
        System.out.println("Cloned stack: " + clonedStack);
        }
}