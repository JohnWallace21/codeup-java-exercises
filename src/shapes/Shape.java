package shapes;

abstract class Shape {
    public class ShapesTest {
        public static void main(String[] args) {

            Measurable myShape;
            myShape = new Rectangle(4, 9) {
            };
            System.out.println("The area for my rectangle is " + myShape.getArea() + " and the perimeter is..." + myShape.getPerimeter());
//     sout

        }
