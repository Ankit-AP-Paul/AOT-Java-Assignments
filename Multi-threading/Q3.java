class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " is finished.");  
    }
}

public class Q3 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread-1", Thread.MIN_PRIORITY);
        Thread thread2 = new MyThread("Thread-2", Thread.NORM_PRIORITY);
        Thread thread3 = new MyThread("Thread-3", Thread.NORM_PRIORITY);
        Thread thread4 = new MyThread("Thread-4", Thread.MAX_PRIORITY);
        Thread thread5 = new MyThread("Thread-5", Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        System.out.println("Main thread is finished.");
    }
}