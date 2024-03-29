public class GenericStack<E> {
    private int SIZE = 0;
    private E[] arr;
    public GenericStack(){
        arr = (E[]) new Object[2];
    }
    public int getSize() {
        return SIZE;
    }
    public E peek() {
        return arr[SIZE - 1];
    }
    public void push(E o) {
        if (SIZE == arr.length) {
            E[] newArray = (E[]) new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
        }
        arr[SIZE++] = o;
    }
    public E pop() {
        E o = arr[SIZE - 1];
        arr[--SIZE] = null;
        return o;
    }
    public boolean isEmpty() {
        return SIZE == 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < SIZE; i++) {
            sb.append(arr[i]);
            if (i < SIZE - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}