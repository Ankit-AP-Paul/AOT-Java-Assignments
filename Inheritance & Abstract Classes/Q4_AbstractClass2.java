abstract class Super {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

class Sub extends Super {
    //shows error, Sub class must override all abstract methods
    @Override
    void m1() {
        System.out.println("Sub class m1() method");
    }
}
