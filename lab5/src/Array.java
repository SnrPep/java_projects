import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<Comparable> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        try {
            ArrayList<Comparable> result = maxAndMin(list);
            System.out.println("Max: " + result.get(0) + ", Min: " + result.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Comparable> maxAndMin(ArrayList<Comparable> list) throws Exception {
        if (list.size() < 2) {
            throw new Exception("ArrayList must contain at least two elements");
        }

        Comparable max = Collections.max(list);
        Comparable min = Collections.min(list);

        ArrayList<Comparable> result = new ArrayList<>();
        result.add(max);
        result.add(min);

        return result;
    }
}