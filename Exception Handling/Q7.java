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
		try {
			g();
		} catch (UserDefinedException1 e) {
			System.out.println(e);
			try {
				throw new UserDefinedException2();
			} catch (UserDefinedException2 e1) {
				System.out.println(e1);
			}
		}
	}
	void g() throws UserDefinedException1 {
		throw new UserDefinedException1();
	}
}

class Q7 {
	public static void main(String[] args) {
		Test t = new Test();
		t.f();
	}
}
