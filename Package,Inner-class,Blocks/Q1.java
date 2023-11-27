class A {
	public int a=10;
	private int b=20;
	public int getData() {
		return b;
	}
}
class B {
	public static void main(String[] args) {
		A a=new A();
		System.out.println("Private data = "+a.getData());
	}
}
