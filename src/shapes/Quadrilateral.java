package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral (int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);

    public double getArea() {
        return this.length * this.width;
    }


    @Override
    public double getPerimeter() {
        return (this.length*2) + (this.width*2);
    }
}
