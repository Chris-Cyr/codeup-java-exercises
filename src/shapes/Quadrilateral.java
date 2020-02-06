package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral (double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

    public double getArea() {
        return this.length * this.width;
    }


    @Override
    public double getPerimeter() {
        return (this.length*2) + (this.width*2);
    }
}
