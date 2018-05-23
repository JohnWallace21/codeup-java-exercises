package shapes;


abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){}

    public Quadrilateral(double length) {
        this.length = length;
        this.width = width;
    }

    public double getLength(double length) {
        return length;
    }

    public double getWidth(double width) {
        return width;
    }


    public abstract double setWidth(double width);
    public  abstract double setLength(double length);



    }


