package pkg2;
import pkg1.A;
public class B implements A {
	@Override
	public void m1() {
		System.out.println("Overriding m1() method");
	}
	
	@Override
	public void m2() {
		System.out.println("Overriding m2() method");
	}
	
	@Override
	public void m3() {
		System.out.println("Overriding m3() method");
	}
}