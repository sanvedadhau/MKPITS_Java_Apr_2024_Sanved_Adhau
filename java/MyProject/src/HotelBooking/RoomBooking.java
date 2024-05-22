package HotelBooking;
class RoomBooking extends Thread {
    private int price;
    private int totalEarnings = 0;
    private boolean updated = false;

    // Method to update total earnings safely
    private synchronized void updateTotalEarnings() {
        totalEarnings += price;
        updated = true;
        // Notify other threads waiting for the update
        notify();
    }

    @Override
    public void run() {
        price = (int) (Math.random() * 100) + 50; // Generate a random price between 100 and 200
        System.out.println(Thread.currentThread().getName() + " booked a room for $" + price);

        // Update total earnings
        updateTotalEarnings();
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public void waitForUpdate() {
        // Wait until the total earnings are updated
        synchronized (this) {
            while (!updated) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            updated = false;
        }
    }
}

