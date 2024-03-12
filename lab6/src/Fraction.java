import java.util.Comparator;

public class Fraction implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int compareTo(Fraction other) {
        return Double.compare((double) this.numerator / this.denominator, (double) other.numerator / other.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static Comparator<Fraction> getComparator(SortOrder order, AbsoluteValueOrder absOrder) {
        return (f1, f2) -> {
            double value1 = absOrder == AbsoluteValueOrder.ASCENDING ? Math.abs((double) f1.numerator / f1.denominator) : (double) f1.numerator / f1.denominator;
            double value2 = absOrder == AbsoluteValueOrder.ASCENDING ? Math.abs((double) f2.numerator / f2.denominator) : (double) f2.numerator / f2.denominator;
            int comparison = Double.compare(value1, value2);
            return order == SortOrder.ASCENDING ? comparison : -comparison;
        };
    }

    public enum SortOrder {
        ASCENDING, DESCENDING
    }

    public enum AbsoluteValueOrder {
        ASCENDING, DESCENDING
    }
}