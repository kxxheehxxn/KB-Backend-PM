package d0424.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread movieThread = new MovieThread();
        movieThread.start();

        Thread musicThread = new Thread(new MusicRunnable());
        musicThread.start();
    }
}