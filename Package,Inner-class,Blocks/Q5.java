class P {
	static {
		System.out.println("Parent class static block");
	}
}
class C extends P {
	static {
		System.out.println("Child class static block-1");
	}
	static {
		System.out.println("Child class static block-2");
	}
	public static void main(String[] args) {}
}