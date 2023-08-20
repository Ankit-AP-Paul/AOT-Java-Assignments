class Student {
	long rollNo;
	String name;
	String stream;
	String clg;
	Student(long rollNo, String name, String stream, String clg) {
		this.rollNo=rollNo;
		this.name=name;
		this.stream=stream;
		this.clg=clg;
	}
	void show() {
		System.out.println();
		System.out.println("Roll no. = "+rollNo);
		System.out.println("Name = "+name);
		System.out.println("Stream = "+stream);
		System.out.println("College = "+clg);
	}
	public static void main(String[] args) {
		Student s1=new Student(Long.parseLong(args[0]),args[1],args[2], args[3]);
		Student s2=new Student(Long.parseLong(args[4]),args[5],args[6], args[7]);
		s1.show();
		s2.show();
	}
}
