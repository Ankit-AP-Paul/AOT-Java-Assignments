class MyThread1 extends Thread {
        
    MyThread1() {
        System.out.println("Thread " + this.getName() + " is starting.");
    }
    
    @Override
    public void run() {
        Thread th=Thread.currentThread();
        for(int i=1;i<=3;i++) {
            System.out.println("Thread " + th.getName() + " is running.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        System.out.println("Thread " + th.getName() + " is done.");        
    }
}

class Q1 {
    public static void main(String[] args) {
        MyThread1 thread1=new MyThread1();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("Main thread is done.");
    }
}
