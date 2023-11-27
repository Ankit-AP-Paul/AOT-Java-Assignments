class Parent {
	{
		System.out.println("Parent class block");
	}
}
class Child extends Parent {
	{
		System.out.println("Child class block-1");
	}
	{
		System.out.println("Child class block-2");
	}
	public static void main(String[] args) {
		Child c=new Child();
	}
}