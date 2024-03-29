public class TestTextPrinter {
    public static void main(String[] args) {
        String[] texts = {
                "В мире программирования язык Java,\n",
                "Своей универсальностью он завоевал сердца.\n",
                "Строго типизированный, объектно-ориентированный,\n",
                "Он позволяет создавать программы, которые работают на любом устройстве.\n",
                "С помощью Java мы можем писать код, который работает везде,\n"
        };

        for (String text : texts) {
            new TextPrinter(text).start();
        }
    }
}
