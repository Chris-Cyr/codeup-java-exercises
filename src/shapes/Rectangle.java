package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
}

//
//
//    public Rectangle (int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//    public int getArea (int length, int width){
//        return length * width;
//    }
//
//    public int getPerimeter (int length, int width){
//        return (2 * length) + (2 * width);
//    }
