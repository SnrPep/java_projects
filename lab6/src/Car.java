import java.util.PriorityQueue;
import java.util.Comparator;

enum CarType {
    REGULAR, POLICE, MEDICAL
}

class Car {
    private CarType type;
    private String number;

    public Car(CarType type, String number) {
        this.type = type;
        this.number = number;
    }

    public CarType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car: " + type + ", " + number ;
    }
}

class PriorityComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getType() == CarType.MEDICAL && car2.getType() != CarType.MEDICAL) {
            return -1;
        } else if (car1.getType() != CarType.MEDICAL && car2.getType() == CarType.MEDICAL) {
            return 1;
        }
        else if (car1.getType() == CarType.POLICE && car2.getType() != CarType.POLICE) {
            return -1;
        } else if (car1.getType() != CarType.POLICE && car2.getType() == CarType.POLICE) {
            return 1;
        }
        else {
            return car1.getNumber().compareTo(car2.getNumber());
        }
    }
}

class AlternativePriorityComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getType() == CarType.POLICE && car2.getType() != CarType.POLICE) {
            return -1;
        } else if (car1.getType() != CarType.POLICE && car2.getType() == CarType.POLICE) {
            return 1;
        }
        else if (car1.getType() == CarType.MEDICAL && car2.getType() != CarType.MEDICAL) {
            return -1;
        } else if (car1.getType() != CarType.MEDICAL && car2.getType() == CarType.MEDICAL) {
            return 1;
        }
        else {
            return car1.getNumber().compareTo(car2.getNumber());
        }
    }
}