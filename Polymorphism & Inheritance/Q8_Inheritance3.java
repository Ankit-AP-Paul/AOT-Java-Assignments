class A {
	void show() {
		System.out.println("A class");
	}
}

class B extends A {
	void show() {
		System.out.println("B class");
	}
}
class C extends A {
	void show() {
		System.out.println("C class");
	}
}
class D extends A {
	void show() {
		System.out.println("D class");
	}
}

class Inheritance3 {
	public static void main(String[] args) {
		A a=new A();
		a.show();
		B b=new B();
		b.show();
		C c=new C();
		c.show();
		D d=new D();
		d.show();
	}
}
