import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestFraction {
    public static void main(String[] args) {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(2, 3));
        fractions.add(new Fraction(-1, 3));
        fractions.add(new Fraction(1, 4));

        // Сортировка по возрастанию
        Collections.sort(fractions);
        System.out.println("Сортировка по возрастанию: " + fractions);

        // Сортировка по убыванию
        fractions.sort(Collections.reverseOrder());
        System.out.println("Сортировка по убыванию: " + fractions);

        // Сортировка по возрастанию абсолютных значений
        fractions.sort(Fraction.getComparator(Fraction.SortOrder.ASCENDING, Fraction.AbsoluteValueOrder.ASCENDING));
        System.out.println("Сортировка по возрастанию абсолютных значений: " + fractions);

        // Сортировка по убыванию абсолютных значений
        fractions.sort(Fraction.getComparator(Fraction.SortOrder.DESCENDING, Fraction.AbsoluteValueOrder.ASCENDING));
        System.out.println("Сортировка по убыванию абсолютных значений: " + fractions);
    }
}