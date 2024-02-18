public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    long start(){
        startTime = System.currentTimeMillis();
        return startTime;
    }

    long stop(){
        endTime = System.currentTimeMillis();
        return endTime;
    }

    long getElapsedTime(){
        return endTime - startTime;
    }
}
