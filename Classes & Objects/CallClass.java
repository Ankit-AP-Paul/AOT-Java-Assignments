class B {
	int val=15;
	void show() {
		System.out.println("B class show() method");
	}
}

class CallClass {
	public static void main(String[] args) {
		B b=new B();
		System.out.println("B class instance var = "+b.val);
		b.show();
	}
}
