// Class representing a 2D point
class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

// Superclass for all quadrilaterals (四边形)
class Quadrilateral {
    protected Point p1, p2, p3, p4; // 4 corner points

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // No area method here (abstract idea)
}

// Subclass: Trapezoid (梯形) - assume area formula is known
class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Simple area assuming bases are horizontal and vertical height can be computed
    public double getArea() {
        double base1 = Math.abs(p1.x - p2.x);
        double base2 = Math.abs(p3.x - p4.x);
        double height = Math.abs(p1.y - p3.y);
        return 0.5 * (base1 + base2) * height;
    }
}

// Subclass: Parallelogram (平行四边形)
class Parallelogram extends Trapezoid {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Area = base * height
    public double getArea() {
        double base = Math.abs(p1.x - p2.x);
        double height = Math.abs(p1.y - p3.y);
        return base * height;
    }
}

// Subclass: Rectangle (矩形)
class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Area = length * width
    public double getArea() {
        double length = Math.abs(p1.x - p2.x);
        double width = Math.abs(p1.y - p3.y);
        return length * width;
    }
}

// Subclass: Square (正方形)
class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Area = side^2
    public double getArea() {
        double side = Math.abs(p1.x - p2.x);
        return side * side;
    }
}

// Test class with main method
public class TestGeometry {
    public static void main(String[] args) {
        // Trapezoid (梯形)
        Point A1 = new Point(0, 0);
        Point B1 = new Point(6, 0);
        Point C1 = new Point(4, 3);
        Point D1 = new Point(2, 3);
        Trapezoid t = new Trapezoid(A1, B1, C1, D1);
        System.out.println("Trapezoid Area: " + t.getArea());

        // Parallelogram (平行四边形)
        Point A2 = new Point(8, 0);
        Point B2 = new Point(12, 0);
        Point C2 = new Point(11, 3);
        Point D2 = new Point(7, 3);
        Parallelogram p = new Parallelogram(A2, B2, C2, D2);
        System.out.println("Parallelogram Area: " + p.getArea());

        // Rectangle (矩形)
        Point A3 = new Point(0, 4);
        Point B3 = new Point(4, 4);
        Point C3 = new Point(4, 9);
        Point D3 = new Point(0, 9);
        Rectangle r = new Rectangle(A3, B3, C3, D3);
        System.out.println("Rectangle Area: " + r.getArea());

        // Square (正方形)
        Point A4 = new Point(6, 5);
        Point B4 = new Point(8, 5);
        Point C4 = new Point(8, 7);
        Point D4 = new Point(6, 7);
        Square s = new Square(A4, B4, C4, D4);
        System.out.println("Square Area: " + s.getArea());
    }
}