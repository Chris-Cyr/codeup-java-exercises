package shapes;

public class Square extends Quadrilateral {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }


//    public double getPerimeter() {
//        return side * 4;
//    }
//
//
//    public double getArea() {
//        return side * side;
//    }

    @Override
    public double getPerimeter(int length, int width) {
        return this.side * 4;
    }

    @Override
    public double getArea(int length, int width) {
        return this.side * this.side;
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
