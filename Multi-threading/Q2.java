class MyRunnable implements Runnable {
    public MyRunnable(String name) {
        System.out.println("Thread " + name + " is starting.");
    }

    @Override
    public void run() {
        for (int i=0; i<3; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " is done.");  
    }
}

public class Q2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable("MyRunnable");
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.err.println(e);

        }
        System.out.println("Main thread is done.");
    }
}
