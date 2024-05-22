package HotelBooking;
public class HotelBookingApp {
    public static void main(String[] args) {
        final int NUM_BOOKINGS = 10;

        // Create threads for room bookings
        Thread[] threads = new Thread[NUM_BOOKINGS];
        for (int i = 0; i < NUM_BOOKINGS; i++) {
            threads[i] = new RoomBooking();
        }

        // Start room booking threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for all threads to complete and display total earnings after each booking
        for (Thread thread : threads) {
            RoomBooking roomBooking = (RoomBooking) thread;
            roomBooking.waitForUpdate();
            System.out.println("Total earnings so far: $" + roomBooking.getTotalEarnings());
        }

        // Display final total earnings
        RoomBooking roomBooking = (RoomBooking) threads[NUM_BOOKINGS - 1];
        System.out.println("Total earnings: $" + roomBooking.getTotalEarnings());
    }
}
