import java.util.Random;

public class TestStopWatch {
    static int[] createMassive(int size){
        int[] mass = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++){
            mass[i] = rand.nextInt(100000);
        }
        return mass;
    }

    static int[] sort(int[] mass){
        int a = 0;

        for (int i = 1; i < mass.length; i++){
            if (mass[i-1] > mass[i]){
                a = mass[i-1];
                mass[i-1] = mass[i];
                mass[i] = a;
            }
        }
        return mass;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        sort(createMassive(10000000));
        watch.stop();

        System.out.println("Время работы: " + watch.getElapsedTime());
    }
}
