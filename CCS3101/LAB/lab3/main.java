class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate the Euclidean distance between two points
    public double distance(Point p) {
        return Math.hypot(x - p.x, y - p.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// The base class for all four-sided shapes
class Quadrilateral {
    private Point p1, p2, p3, p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }
}

// A trapezoid has at least one pair of parallel sides 梯形
class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Approximate area = 0.5 * (base1 + base2) * height
    public double getArea() {
        double base1 = getP1().distance(getP2());
        double base2 = getP3().distance(getP4());
        double height = Math.abs(getP2().getY() - getP3().getY());
        return 0.5 * (base1 + base2) * height;
    }
}

// A parallelogram has both pairs of opposite sides parallel 平行四边形
class Parallelogram extends Trapezoid {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Area = base * height
    @Override
    public double getArea() {
        double base = getP1().distance(getP2());
        double height = Math.abs(getP1().getY() - getP4().getY());
        return base * height;
    }
}

// A rectangle is a parallelogram with right angles 长方形
class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Area = length * width
    @Override
    public double getArea() {
        double length = getP1().distance(getP2());
        double width = getP2().distance(getP3());
        return length * width;
    }
}

// A square is a rectangle with all sides equal
class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Area = side * side
    @Override
    public double getArea() {
        double side = getP1().distance(getP2());
        return side * side;
    }
}

public class main {
    public static void main(String[] args) {
        // Create and test a Square
        Square square = new Square(
            new Point(0, 0),
            new Point(0, 2),
            new Point(2, 2),
            new Point(2, 0)
        );

        // Create and test a Rectangle
        Rectangle rectangle = new Rectangle(
            new Point(0, 0),
            new Point(0, 3),
            new Point(4, 3),
            new Point(4, 0)
        );

        // Create and test a Parallelogram
        Parallelogram parallelogram = new Parallelogram(
            new Point(0, 0),
            new Point(4, 0),
            new Point(5, 3),
            new Point(1, 3)
        );

        // Create and test a Trapezoid
        Trapezoid trapezoid = new Trapezoid(
            new Point(0, 0),
            new Point(4, 0),
            new Point(3, 2),
            new Point(1, 2)
        );

        // Output areas
        System.out.printf("Square area: %.2f\n", square.getArea());
        System.out.printf("Rectangle area: %.2f\n", rectangle.getArea());
        System.out.printf("Parallelogram area: %.2f\n", parallelogram.getArea());
        System.out.printf("Trapezoid area: %.2f\n", trapezoid.getArea());
    }
}