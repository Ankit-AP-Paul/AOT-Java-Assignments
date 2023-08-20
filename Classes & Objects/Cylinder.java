class Cylinder {
	double r, h;
	Cylinder(double r, double h) {
		this.r=r;
		this.h=h;
	}
	double surfaceArea() {
		return ((2*(22.0/7)*r*r)+(2*(22.0/7)*r*h));
	}
	double circumference() {
		return (2*(22.0/7)*r);
	}
	public static void main(String[] args) {
		Cylinder ob=new Cylinder(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		System.out.println("Surface Area = "+ob.surfaceArea());
		System.out.println("Circumference = "+ob.circumference());
	}
}
