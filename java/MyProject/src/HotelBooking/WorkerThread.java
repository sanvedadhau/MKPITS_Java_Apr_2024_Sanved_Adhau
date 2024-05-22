package HotelBooking;

class WorkerThread extends Thread {
    private int taskId;

    public WorkerThread(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Thread " + taskId + " is starting.");
        try {
            // Simulate some task execution
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + taskId + " is finished.");
    }
}