package producerconsumer;

public class Consumer extends Thread {
    Company company;
    Consumer(Company company){
        this.company=company;
    }
    public void run(){
        int i =1;
        while (true){
            try{
                company.consume_item(i);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            i++;

        }
    }
}
