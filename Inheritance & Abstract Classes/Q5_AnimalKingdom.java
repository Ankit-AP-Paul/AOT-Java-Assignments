class Animal {
	String food;
	String motion;
	Animal(String food, 	String motion) {
		this.food=food;
		this.motion=motion;
	}
	void show() {
		System.out.println("Food = "+food+"\nMotion = "+motion);
	}
}

class Mammal extends Animal {
	String hairs;
	boolean feedBrestMilk;
	String blood;
	Mammal(String food, 	String motion, String hairs, boolean feedBrestMilk, String blood) {
		super(food, motion);
		this.hairs=hairs;
		this.feedBrestMilk=feedBrestMilk;
		this.blood=blood;
	}
	void show() {
		super.show();
		System.out.println("Hairs = "+hairs+"\nFeed Brest Milk = "+feedBrestMilk+"\nBlood = "+blood);
	}
}

class Reptile extends Animal {
	String scales;
	boolean crawl;
	String blood;
	Reptile(String food, 	String motion, String scales, boolean crawl, String blood) {
		super(food, motion);
		this.scales=scales;
		this.crawl=crawl;
		this.blood=blood;
	}
	void show() {
		super.show();
		System.out.println("Scales = "+scales+"\nCan cwarl = "+crawl+"\nBlood = "+blood);
	}
}

class AnimalKingdom {
	public static void main(String[] args) {
		
		System.out.println("Human object");
		Mammal human=new Mammal("pizza, burger, chicken", "2 legged motion", "light hairs" , true, "warm-blooded");
		human.show();
		
		System.out.println("\nCow object");
		Mammal cow=new Mammal("grass, wheat", "4 legged motion", "fur", true, "warm blooded");
		cow.show();
		
		System.out.println("\nSnake object");
		Reptile snake=new Reptile("frog, rabbit", "slithering", "dorsal scales", true, "cold blooded");
		snake.show();
		
		System.out.println("\nCrocodile object");
		Reptile crocodile=new Reptile("birds, fish, frog", "swimming, crawling", "scutes", true, "cold blooded");
		crocodile.show();
	}
}

