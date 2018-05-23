package shapes;

abstract class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    //    public Rectangle(double length, double width){
//
//    }
    public double setWidth(double width) {
        return width;
    }

    public double setLength(double length) {
        return length;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }
}
//   protected int length;
//    protected int width;
//
//        public Rectangle(){}
//
//
//        public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//    public int getArea(){
//        return length * width;
//    }
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
