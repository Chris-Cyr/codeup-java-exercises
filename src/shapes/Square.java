package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    public void setLength (int length){
        this.length = length;
        this.width = length;
    }

    public void setWidth (int width){
        this.width = width;
        this.length = width;
    }
}
//    private int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea() {
//        int area = (int) Math.pow(this.side, 2);
//        return area;
//    }
//
//    public int getPerimeter()
//    {
//        return 4 * this.side;
//    }
//    public double getPerimeter() {
//        return side * 4;
//    }
//
//
//    public double getArea() {
//        return side * side;
//    }