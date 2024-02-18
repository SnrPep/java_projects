public class TestRectangle {
    public static void main(String[] args) {
        Rectangle Rectangle1 = new Rectangle();
        System.out.println("Ширина равна " + Rectangle1.weight + ", высота равна " + Rectangle1.height + ", площадь равна " + Rectangle1.getArea() + ", периметр равен " + Rectangle1.getPerimeter());

        Rectangle Rectangle2 = new Rectangle(4, 40);
        System.out.println("Ширина равна " + Rectangle2.weight + ", высота равна " + Rectangle2.height + ", площадь равна " + Rectangle2.getArea() + ", периметр равен " + Rectangle2.getPerimeter());

        Rectangle Rectangle3 = new Rectangle(3.5, 35.9);
        System.out.println("Ширина равна " + Rectangle3.weight + ", высота равна " + Rectangle3.height + ", площадь равна " + Rectangle3.getArea() + ", периметр равен " + Rectangle3.getPerimeter());
    }
}