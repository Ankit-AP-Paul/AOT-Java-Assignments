class Box2 {
	double volume(double s) {
		return s*s*s;
	}
	double volume(double r, double h) {
		return (1.0/3.0)*Math.PI*r*r*h;
	}
	public static void main(String[] args) {
		Box2 ob=new Box2();
		System.out.println("Volume of cone = "+ob.volume(5,10));
		System.out.println("Volume of cube = "+ob.volume(5));
	}
}
