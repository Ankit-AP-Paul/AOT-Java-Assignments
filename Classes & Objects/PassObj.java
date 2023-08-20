class A {
	int val=10;
}

class PassObj {
	int val=20;
	void show(PassObj obj) {
		System.out.println("Same class instance var = "+obj.val);
	}
	void show(A obj) {
		System.out.println("A class instance var = "+obj.val);
	}
	public static void main(String[] args) {
		PassObj po=new PassObj();
		A a=new A();
		po.show(po);
		po.show(a);
	}
}
