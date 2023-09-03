abstract class P {
    static void meth() {
        System.out.println("Abstract class meth() method");
    }
}

class C {
    public static void main(String[] args) {
        P.meth();
    }
}
