package HotelBooking;



public class DaemonThreadDemo {
    public static void main(String[] args) {
        // Create worker threads
        Thread thread1 = new WorkerThread(1);
        Thread thread2 = new WorkerThread(2);
        Thread thread3 = new WorkerThread(3);

        // Create and set a daemon thread
        Thread daemonThread = new Thread(() -> {
            System.out.println("Daemon thread is starting.");
            try {
                // Simulate daemon thread activity
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Daemon thread is finished.");
        });
        daemonThread.setDaemon(true); // Set daemon flag to true
        daemonThread.start();

        // Start worker threads
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Wait for worker threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished.");
    }
}

