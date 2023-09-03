class Overloading1 {
	//error: Duplicate method m1() in overloading not allowed
	void m1() {
		System.out.println("void m1() method");
	}
	int m1() {
		System.out.println("int m1() method");
		return 0;
	}
	public static void main(String[] args) {
		Overloading1 ob=new Overloading1();
		ob.m1();
	}
}
