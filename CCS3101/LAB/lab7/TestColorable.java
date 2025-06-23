public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(5);
        objects[1] = new Rectangle(3, 4);
        objects[2] = new Circle(2);
        objects[3] = new Square(3);
        objects[4] = new Circle(5);

        for (GeometricObject obj : objects) {
            System.out.printf("Area: %.2f\n", obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}