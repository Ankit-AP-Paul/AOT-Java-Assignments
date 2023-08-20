class C {
	C returnRef() {
		return this;
	}
}

class Test {
	Test returnRef() {
		return this;
	}
	public static void main(String[] args) {
		Test t=new Test();
		C c=new C();
		System.out.println("c obj = "+c.returnRef().getClass());
		System.out.println("t obj = "+t.returnRef().getClass());
	}
}
