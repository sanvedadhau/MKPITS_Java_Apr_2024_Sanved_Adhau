package SumThread;


public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.start();
        synchronized (sum) {
            try {
                sum.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("newSum : " +sum.sum);
        }
    }
}
