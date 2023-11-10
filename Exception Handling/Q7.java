class UserDefinedException1 extends Exception {
	public String getMessage() {
		return "User defined exception 1 message";
	}
}

class UserDefinedException2 extends Exception {
	public String getMessage() {
		return "User defined exception 2 message";
	}
}

class Test {
	void f() {
		g();
	}
	void g() {
		try {
			throw new UserDefinedException1();
		}
		catch(Exception e1) {
			System.out.println(e1);
			try {
				throw new UserDefinedException2();
			}
			catch(Exception e2)    {
				System.out.println(e2);
			}
		}
	}
}

class Q7 {
	public static void main(String[] args) {
		Test t = new Test();
		t.f();
	}
}
