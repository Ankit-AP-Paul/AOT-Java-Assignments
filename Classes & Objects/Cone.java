class Cone {
	double r, h;
	Cone(double r, double h) {
		this.r=r;
		this.h=h;
	}
	double volume() {
		return ((1.0/3)*(22.0/7)*r*r*h);
	}
	double surfaceArea() {
		double l = Math.sqrt((r*r)+(h*h));
		return (((22.0/7)*r*r)+((22.0/7)*r*l));
	}
	public static void main(String[] args) {
		Cone ob=new Cone(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		System.out.println("Volume = "+ob.volume());
		System.out.println("Surface Area = "+ob.surfaceArea());
	}
}
