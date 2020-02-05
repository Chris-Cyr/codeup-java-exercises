package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter(int length, int width) {
        return (2 * length) + (2* width);
    }

    @Override
    public double getArea(int length, int width) {
        return length * width;
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
