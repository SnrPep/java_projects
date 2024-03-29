public class TestIntContainer {
    public static void main(String[] args) {
        IntContainer container1 = new IntContainer(3);

        try {
            container1.push(1);
            container1.push(2);
            container1.push(8);
            container1.push(8);
        } catch (ContainerFullException e) {
            System.out.println(e.getMessage());
        }

        IntContainer container2 = new IntContainer(5);

        try {
            container2.push(8);
            container2.push(8);
            container2.push(8);
            container2.push(8);
        } catch (ContainerFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            container2.sort();
        } catch (ContainerEmptyException | AllElementsEqualException e) {
            System.out.println(e.getMessage());
        }

        IntContainer container3 = new IntContainer(5);

        try {
            container3.push(1);
            container3.push(2);
            container3.push(8);
            container3.push(8);
        } catch (ContainerFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            int index = container3.find(8);
            if (index != -1) {
                System.out.println("Элемент найден на позиции: " + index);
            } else {
                System.out.println("Элемент не найден");
            }
        } catch (MultipleElementsException e) {
            System.out.println(e.getMessage());
        }

        IntContainer container4 = new IntContainer(5);

        try {
            int value = container4.pop();
            System.out.println("Удален элемент: " + value);
        } catch (ContainerEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
