interface I1 {
	void m1();
	void m2();
}

interface I2 {
	void m3();
	void m4();
}

interface I3 extends I1,I2 {
	void m5();
}

class A {
	void meth() {
		System.out.println("A class method");
	}
}

class B extends A implements I3 {
	public void m1() {
		System.out.println("m1() method");
	}
	public void m2() {
		System.out.println("m2() method");
	}
	public void m3() {
		System.out.println("m3() method");
	}
	public void m4() {
		System.out.println("m4() method");
	}
	public void m5() {
		System.out.println("m5() method");
	}
}

class InheritInterface {
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.meth();
	}
}

