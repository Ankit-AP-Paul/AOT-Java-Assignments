class A {
	String str;
	void m1() throws Exception {
		System.out.println("A class m1() method");
	}
}
class B extends A {
	void m1() throws NullPointerException {
		System.out.println("B class m1() method");
		if(str==null)
			throw new NullPointerException();
	}
}
public class Q9 {
	public static void main(String[] args) throws Exception {
		A a=new A();
		a.m1();
		B b=new B();
		b.m1();
	}
}
