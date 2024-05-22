package producerconsumer;

public class Producer extends Thread{
    Company company;
    Producer(Company company){
        this.company=company;
    }
    public void run(){
        int i = 1;
        while(true){
            try {
                company.producer_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
