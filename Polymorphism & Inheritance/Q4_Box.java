class Q4_Box {
	double s;
	double r,h;
	Q4_Box(double s) {		//cube
		this.s=s;
	}
	Q4_Box(double r, double h) {		//cone
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
		Q4_Box ob1=new Q4_Box(5);
		System.out.println("Volume of cube = "+ob1.volume());
		//cone
		Q4_Box ob2=new Q4_Box(5,10);
		System.out.println("Volume of cone = "+ob2.volume());
	}
}
