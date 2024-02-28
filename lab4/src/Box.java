import java.util.ArrayList;
public class Box extends Shape{
    ArrayList<Shape> shapes = new ArrayList<>();
    double availableVolume;
    public Box(double availableVolume){
        this.availableVolume = availableVolume;
    }
    public boolean add(Shape shape){
        if (shape.getVolume() <= availableVolume) {
            shapes.add(shape);
            availableVolume -= shape.getVolume();
            System.out.println("Yes");
            return true;
        } else {
            System.out.println("No");
            return false;
        }
    }
    @Override
    double getVolume() {
        double volume = 0;
        for (Shape shape : shapes) {
            volume += shape.getVolume();
        }
        return volume;
    }
}
