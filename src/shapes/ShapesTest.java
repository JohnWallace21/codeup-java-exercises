package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;
        myShape = new Rectangle(4, 9) {
        };
        System.out.println("The area for my rectangle is " + myShape.getArea() + " and the perimeter is..." + myShape.getPerimeter());
//     sout


// Rectangle box1 = new Rectangle(4,5);
//     Rectangle box2 = new Square(5);

//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//    }
//}


    }   }