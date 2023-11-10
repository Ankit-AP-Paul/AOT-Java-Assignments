class MyData {
    int value=0;
    boolean flag=true;
    synchronized public void set(int v) {
        while(flag!=true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get() {
        while (flag!=false) {
             try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int x=value;
        flag=true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyData d;
    Producer(MyData d) {
        this.d=d;
    }
    @Override
    public void run() {
        int i=1;
        while (true) {
            d.set(i);
            System.out.println("Producer : "+i);
            i++;
        }
    }
}

class Consumer extends Thread {
    MyData d;
    Consumer(MyData d) {
        this.d=d;
    }
    @Override
    public void run() {
        while(true) {
            System.out.println("Consumer : "+d.get());
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        MyData d=new MyData();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
}
