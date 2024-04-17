import java.util.concurrent.*;

public class TestProduct {
    public static void main(String[] args) {
        BlockingQueue<Detail> queueA = new LinkedBlockingQueue<>(5);
        BlockingQueue<Detail> queueB = new LinkedBlockingQueue<>(5);
        BlockingQueue<Detail> queueC = new LinkedBlockingQueue<>(5);
        BlockingQueue<Detail> queueD = new LinkedBlockingQueue<>(5);

        new Thread(new DetailProducer(queueA, "A", 1)).start();
        new Thread(new DetailProducer(queueB, "B", 3)).start();
        new Thread(new DetailProducer(queueC, "C", 2)).start();
        new Thread(new DetailProducer(queueD, "D", 1)).start();

        new Thread(new ProductProducer(queueA, queueB, queueC, queueD)).start();
    }
}