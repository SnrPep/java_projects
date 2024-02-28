public class Pyramid extends Shape{
    double s, h;
    public Pyramid(double s, double h){
        this.s = s;
        this.h = h;
    }
    @Override
    double getVolume() {
        return s * h / 3;
    }
}
