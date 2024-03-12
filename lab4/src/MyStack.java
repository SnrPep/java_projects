import java.util.ArrayList;

public class MyStack {
    private ArrayList<Comparable> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Comparable peek() {
        return list.get(getSize() - 1);
    }

    public Comparable pop() {
        Comparable o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Comparable o) {
        list.add(o);
    }

    public void sort() {
        for (int i = 1; i < getSize(); i++) {
            Comparable current = list.get(i);
            int j = i - 1;

            while (j >= 0 && current.compareTo(list.get(j)) < 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, current);
        }
    }

    @Override
    public String toString() {
        return "стек: " + list.toString();
    }
}
