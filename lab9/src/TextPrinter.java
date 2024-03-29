public class TextPrinter extends Thread {
    private String text;

    public TextPrinter(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        synchronized (System.out){
            System.out.println("Thread ID: " + Thread.currentThread().getId());
            System.out.println(text);
        }
    }
}