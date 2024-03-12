import java.util.PriorityQueue;

public class TestCar {
    public static void main(String[] args) {
        PriorityQueue<Car> queue1 = new PriorityQueue<>(new PriorityComparator());
        queue1.add(new Car(CarType.MEDICAL, "A123BC"));
        queue1.add(new Car(CarType.REGULAR, "B456DE"));
        queue1.add(new Car(CarType.POLICE, "C789EF"));

        System.out.println("PriorityQueue with PriorityComparator:");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

        PriorityQueue<Car> queue2 = new PriorityQueue<>(new AlternativePriorityComparator());
        queue2.add(new Car(CarType.MEDICAL, "A123BC"));
        queue2.add(new Car(CarType.REGULAR, "B456DE"));
        queue2.add(new Car(CarType.POLICE, "C789EF"));

        System.out.println("\nPriorityQueue with AlternativePriorityComparator:");
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }
}
