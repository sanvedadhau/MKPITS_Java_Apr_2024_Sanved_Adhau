package producerconsumer;

//inter thread communication
public class Company {
    int n;
    boolean f=false;

    public synchronized void producer_item(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("produced : "+this.n);
        f = true;
        notify();
    }

    public synchronized void consume_item(int i) throws InterruptedException {
        if(!f){
            wait();
        }
        System.out.println("consumed : " + this.n);
        f = false;
        notify();
    }
    }
