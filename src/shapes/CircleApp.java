package shapes;

public class CircleApp {
    public static void main(String[] args) {

        System.out.println(Circle.getNumberOfCircles());

        Circle circle = new Circle(3);
        System.out.println(Circle.getNumberOfCircles());

        Circle circ = new Circle(42);
        System.out.println(Circle.getNumberOfCircles());
    }
}
