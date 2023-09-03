class TwoD {
    double length;
    double breadth;
    TwoD(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        System.out.println("Area is undefined");
        return 0.0;
    }
}

class Triangle extends TwoD {
    Triangle(double base, double height) {
        super(base, height);
    }
    @Override
    double area() {
        return 0.5*length*breadth;
    }
}

class Square extends TwoD {
    Square(double side) {
        super(side, side);
    }
    @Override
    double area() {
        return length*breadth;
    }
}

class Rectangle extends TwoD {
    Rectangle(double  length, double breadth) {
        super(length, breadth);
    }
    @Override
    double area() {
        return length*breadth;
    }
}