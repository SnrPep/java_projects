public class TestStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("SBER", " ПАО Сбербанк", 281.5);
        stock1.addCurrentPrice(282.87);
        System.out.println("Процент равен " + stock1.getChangePercent());
    }
}
