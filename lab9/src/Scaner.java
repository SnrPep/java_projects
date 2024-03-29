import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Scaner {
    private static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        Thread sortingThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (strings) {
                    Collections.sort(strings);
                }
            }
        });
        sortingThread.setDaemon(true);
        sortingThread.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            synchronized (strings) {
                if (input.length() > 80) {
                    int index = 0;
                    while (index < input.length()) {
                        strings.add(input.substring(index, Math.min(index + 80, input.length())));
                        index += 80;
                    }
                } else {
                    strings.add(input);
                }
            }
        }
        scanner.close();

        synchronized (strings) {
            for (String str : strings) {
                System.out.println(str);
            }
        }
    }
}
