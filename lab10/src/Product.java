import java.util.concurrent.*;

class Product {}

class Detail {
    private final String name;

    public Detail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class DetailProducer implements Runnable {
    private final BlockingQueue<Detail> queue;
    private final String detailName;
    private final int productionTime;

    public DetailProducer(BlockingQueue<Detail> queue, String detailName, int productionTime) {
        this.queue = queue;
        this.detailName = detailName;
        this.productionTime = productionTime;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (queue.size() < 5) {
                    Thread.sleep(productionTime * 1000L);
                    Detail detail = new Detail(detailName);
                    queue.put(detail);
                    System.out.println("Произведена деталь " + detailName + ", всего в очереди: " + queue.size());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ProductProducer implements Runnable {
    private final BlockingQueue<Detail> queueA;
    private final BlockingQueue<Detail> queueB;
    private final BlockingQueue<Detail> queueC;
    private final BlockingQueue<Detail> queueD;

    public ProductProducer(BlockingQueue<Detail> queueA, BlockingQueue<Detail> queueB, BlockingQueue<Detail> queueC, BlockingQueue<Detail> queueD) {
        this.queueA = queueA;
        this.queueB = queueB;
        this.queueC = queueC;
        this.queueD = queueD;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (!queueB.isEmpty()) {
                    Detail detailC = queueC.take();
                    Detail detailD = queueD.take();
                }

                if (!queueA.isEmpty() && !queueB.isEmpty()) {
                    Thread.sleep(2000);
                    Detail detailA = queueA.take();
                    Detail detailB = queueB.take();
                    Product product = new Product();
                    System.out.println("Произведен продукт, всего в очередях: A-" + queueA.size() + ", B-" + queueB.size() + ", C-" + queueC.size() + ", D-" + queueD.size());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}