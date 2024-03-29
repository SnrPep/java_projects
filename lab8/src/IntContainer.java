import java.util.Arrays;
public class IntContainer {
    private int[] data;
    private int size;

    public IntContainer(int maxSize) {
        data = new int[maxSize];
        size = 0;
    }

    public void push(int value) throws ContainerFullException {
        if (size >= data.length) {
            throw new ContainerFullException("Container is full");
        }
        data[size++] = value;
    }

    public int pop() throws ContainerEmptyException {
        if (size <= 0) {
            throw new ContainerEmptyException("Container is empty");
        }
        return data[--size];
    }

    public void sort() throws ContainerEmptyException, AllElementsEqualException {
        if (size == 0) {
            throw new ContainerEmptyException("Container is empty");
        }
        boolean allEqual = true;
        for (int i = 1; i < size; i++) {
            if (data[i] != data[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            throw new AllElementsEqualException("All elements are equal");
        }
        Arrays.sort(data, 0, size);
    }

    public int find(int value) throws MultipleElementsException {
        int foundIndex = -1;
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                if (foundIndex != -1) {
                    throw new MultipleElementsException("Multiple elements found");
                }
                foundIndex = i;
            }
        }
        return foundIndex;
    }
}

class ContainerFullException extends Exception {
    public ContainerFullException(String message) {
        super(message);
    }
}

class ContainerEmptyException extends Exception {
    public ContainerEmptyException(String message) {
        super(message);
    }
}

class AllElementsEqualException extends Exception {
    public AllElementsEqualException(String message) {
        super(message);
    }
}

class MultipleElementsException extends Exception {
    public MultipleElementsException(String message) {
        super(message);
    }
}