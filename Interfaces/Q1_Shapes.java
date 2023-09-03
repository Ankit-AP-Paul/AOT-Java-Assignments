interface Shape {
	final double PI=3.14;
	double area();
}

class Circle implements Shape {
	double radius;
	Circle(double radius) {
		this.radius=radius;
	}
	public double area() {
		return PI*radius*radius;
	}
}

class Rectangle implements Shape {
	double length,breadth;
	Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double area() {
		return length*breadth;
	}
}

class Shapes {
    public static void main(String[] args) {
        Circle c=new Circle(10);
        System.out.println("Area of circle = "+c.area());
		Rectangle r=new Rectangle(5, 8);
		System.out.println("Area of rectangle = "+r.area());
    }
}