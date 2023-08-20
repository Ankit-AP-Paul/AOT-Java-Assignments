class Student {
	String roll;
	String name;
	Student(String roll, String name) {
		this.roll=roll;
		this.name=name;
	}
	public String toString() {
		return roll+" "+name;
	}
}

class Main {
	public static void main(String[] args) {
		Student s1=new Student(args[0],args[1]);
		Student s2=new Student(args[2],args[3]);
		System.out.println(s1);
		System.out.println(s2);
	}
}

