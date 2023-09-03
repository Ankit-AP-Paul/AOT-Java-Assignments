interface Car {
	int ENGINES=1;
	int WHEELS=4;
	int STEERING=1;
	void engineCapacity();
	void seatingCapacity();
}

interface LuxuryCar extends Car {
	void entertainmentSystem();
	void airbags();
	void parkingSensor();
}

class MercedesBenz implements LuxuryCar {
	public void engineCapacity(){
		System.out.println("1993 cc");
	}
	public void seatingCapacity(){
		System.out.println("5 Seater");
	}
	public void entertainmentSystem(){
		System.out.println("Sony Entertainment System");
	}
	public void airbags(){
		System.out.println("2 front air-bags");
	}
	public void parkingSensor(){
		System.out.println("Olemo reverse car parking sensor LED");
	}
}

class Alto implements Car {
	public void engineCapacity(){
		System.out.println("796 cc");
	}
	public void seatingCapacity(){
		System.out.println("4 Seater");
	}
}

class CarShowroom {
	public static void main(String[] args) {
		MercedesBenz mb=new MercedesBenz();
		System.out.println("Mercedes Benz car");
		mb.engineCapacity();
		mb.seatingCapacity();
		mb.entertainmentSystem();
		mb.airbags();
		mb.parkingSensor();
		System.out.println("\nAlto car");
		Alto a=new Alto();
		a.engineCapacity();
		a.seatingCapacity();
	}
}
