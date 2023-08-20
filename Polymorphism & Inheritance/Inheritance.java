class EMP {
	String name;
	long id;
	EMP(String name, long id) {
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return ("Name = "+name+"\nid = "+id);
	}
}

class Scientist extends EMP {
	int no_of_publication;
	int experience;
	Scientist(String name, long id, int nop, int exp) {
		super(name, id);
		this.no_of_publication=nop;
		this.experience=exp;
	}
	public String toString() {
		return ("Name = "+name+"\nid = "+id+"\nNo. of publications = "+no_of_publication+"\nExperience = "+experience);
	}
}

class Dscientist extends Scientist {
	int award;
	Dscientist(String name, long id, int nop, int exp, int award) {
		super(name, id, nop, exp);
		this.award=award;
	}
	public String toString() {
		return ("Name = "+name+"\nid = "+id+"\nNo. of publications = "+no_of_publication+"\nExperience = "+experience+"\nNo. of awards = "+award);
	}
}

class Inheritance {
	public static void main(String[] args) {
		EMP ob1=new EMP("Ankit",16900121034l);
		System.out.println("EMP class obj");
		System.out.println(ob1);
		System.out.println();
		Scientist ob2=new Scientist("Ankit",16900121034l,5,100);
		System.out.println("Scientist class obj");
		System.out.println(ob2);
		System.out.println();
		Dscientist ob3=new Dscientist("Ankit",16900121034l,5,100,2);
		System.out.println("Dscientist class obj");
		System.out.println(ob3);
		System.out.println();
	}
}
