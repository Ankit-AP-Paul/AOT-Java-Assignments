class Box {
	double s;
	double r,h;
	Box(double s) {		//cube
		this.s=s;
	}
	Box(double r, double h) {		//cone
		this.r=r;
		this.h=h;
	}
	double volume() {
		if(s!=0.0) {
			return s*s*s;
		}
		else {
			return (1.0/3.0)*Math.PI*r*r*h;
		}
	}
	public static void main(String[] args) {
		//cube
		Box ob1=new Box(5);
		System.out.println("Volume of cube = "+ob1.volume());
		//cone
		Box ob2=new Box(5,10);
		System.out.println("Volume of cone = "+ob2.volume());
	}
}
