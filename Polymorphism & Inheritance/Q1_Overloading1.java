class Q1_Overloading1 {
	void m1() {
		System.out.println("void m1() method");
	}
	int m1() {
		System.out.println("int m1() method");
		return 0;
	}
	public static void main(String[] args) {
		Q1_Overloading1 ob=new Q1_Overloading1();
		ob.m1();
	}
}
