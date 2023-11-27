class Q6 {
	int a=10;
	class Inner {
		int b=20;
		void display() {
			System.out.println("a="+a);
		}
	}
	void show() {
		Inner i=new Inner();
		System.out.println("b="+i.b);
		i.display();
	}
	public static void main(String[] args) {
		new Q6().show();
	}
}