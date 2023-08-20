class First {
	int x=19;
	void show() {
		System.out.println("First.show() method called");
	}
	public static void main(String[] args) {
		First ob=new First();
		System.out.println("value of instance variable = "+ob.x);
		ob.show();
	}
}
