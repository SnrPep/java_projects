class Ball extends SolidOfRevolution {
    public Ball(double radius){
        this.radius = radius;
    }
    @Override
    double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double getRadius() {
        return radius;
    }
}
