class PrintData {
    synchronized void display(String s) {
        for(int i=0;i<s.length();i++) {
            System.out.print(s.charAt(i));
        }
    }
}

class MyThread extends Thread {
    PrintData p;
    String s;
    MyThread(PrintData p, String s) {
        this.p=p;
        this.s=s;
    }
    @Override
    public void run() {
        p.display(s);
    }
}

public class Q5 {
    public static void main(String[] args) {
        PrintData p=new PrintData();
        MyThread th1=new MyThread(p,"Welcome to Java ");
        MyThread th2=new MyThread(p,"Java supports the concept Multithreading ");
        th1.start();
        th2.start();
    }
}
