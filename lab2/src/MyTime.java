class MyTime {
    long hour;
    long minute;
    long second;

    MyTime() {
        long currentTimeMillis = System.currentTimeMillis();
        setTime(currentTimeMillis);
    }

    MyTime(long milliseconds) {
        setTime(milliseconds);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int) (totalHours % 24);
    }
}


