class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" has started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(e);
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" has finished");
    }
}

public class Q6 {
    public static void main(String[] args) {
        MyThread th1=new MyThread();
        th1.start();
        if(th1.isAlive()) {
            System.out.println(th1.getName()+" is running");
        }
        try {
            th1.join();
        } catch (InterruptedException e) {
            System.err.println(e);
            e.printStackTrace();
        }
        if(th1.isAlive()) {
            System.out.println(th1.getName()+" is running");
        } else {
            System.out.println(th1.getName()+" is finished");
        }
        System.out.println("Main thread is finished");
    }
}