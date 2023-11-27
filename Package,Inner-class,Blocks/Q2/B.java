package pTwo;
import pOne.*;
public class B extends A {
	public void m2() {
		System.out.println("Data member = "+a);
		System.out.println("Member function call = ");
		m1();
	}
}