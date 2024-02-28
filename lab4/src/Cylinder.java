public class Cylinder extends SolidOfRevolution{
    double height;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    @Override
    double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    double getRadius() {
        return radius;
    }
}
