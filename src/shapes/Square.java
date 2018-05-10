package shapes;

public class Square extends Rectangle {
    public Square( int side) {
        super(side, side);
        this.side = side;

    }

    @Override
    public int getPerimeter() {
        return 4 * side ;
    }

    @Override
    public int getArea() {
        return (int)Math.pow (side, 2) ;
    }

    protected int side;
}
