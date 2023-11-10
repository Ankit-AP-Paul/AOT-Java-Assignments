class Test {
	void m() {}
}
class Q4 {
	public static void main(String[] args) {
		Test t=null;
		try {
			t.m();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
