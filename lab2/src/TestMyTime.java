public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000);
        MyTime time3 = new MyTime(5, 23, 55);

        System.out.println("Время 1: " + time1.hour + ":" + time1.minute + ":" + time1.second);
        System.out.println("Время 2: " + time2.hour + ":" + time2.minute + ":" + time2.second);
        System.out.println("Время 3: " + time3.hour + ":" + time3.minute + ":" + time3.second);
    }
}