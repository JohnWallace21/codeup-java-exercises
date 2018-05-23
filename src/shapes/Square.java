package shapes;

abstract class Square extends Quadrilateral implements Measurable  {
    public Square(double side) {
        super(side, side);
    }

    public double setLength(double side) {
        return this.length = side;
    }
    public double setWidth(double side) {
        return this.width = side;
    }

    public double getPerimeter() {
        return  length * 4;
    }

    public double getArea() {
        return length * 2 ;
    }
}

    //    public Square( int side) {
//        super(side, side);
//        this.side = side;
//
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side ;
//    }
//
//    @Override
//    public int getArea() {
//        return (int)Math.pow (side, 2) ;
//    }
//
//    protected int side;


