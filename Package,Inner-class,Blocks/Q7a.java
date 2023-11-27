abstract class C1 {
	abstract void meth();
}
class Q7a {
	public static void main(String[] args) {
		C1 c=new C1() {
			void meth() {
				System.out.println("Abstract class meth() method implementation");
			}
		};
		c.meth();
	}
}