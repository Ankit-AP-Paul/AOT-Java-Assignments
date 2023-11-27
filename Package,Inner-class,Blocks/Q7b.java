interface I {
	void meth();
}
class Q7b {
	public static void main(String[] args) {
		I i=new I() {
			public void meth() {
				System.out.println("Interface meth() method implementation");
			}
		};
		i.meth();
	}
}