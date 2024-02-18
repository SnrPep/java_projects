// Определение класса круга с двумя конструкторами
class Rectangle {
    double weight;
    double height;

    Rectangle() {
        weight = 1;
        height = 1;
    }

    Rectangle(double newWeight, double newHeight) {
        weight = newWeight;
        height = newHeight;
    }

    double getArea() {
        return weight * height;
    }

    double getPerimeter() {
        return 2 *( weight + height);
    }
}
