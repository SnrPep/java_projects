public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Добавление элементов в стек
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(9);

        // Вывод стека до сортировки
        System.out.println("Стек до сортировки: " + stack);

        // Сортировка стека
        stack.sort();

        // Вывод стека после сортировки
        System.out.println("Стек после сортировки: " + stack);

        // Извлечение элементов из стека
        while (!stack.isEmpty()) {
            System.out.println("Извлеченный элемент: " + stack.pop());
        }
    }
}
