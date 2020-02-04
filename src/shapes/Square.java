package shapes;

public class Square extends Rectangle {
    private int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        int area = (int) Math.pow(this.side, 2);
        return area;
    }

    public int getPerimeter()
    {
        return 4 * this.side;
    }
}
