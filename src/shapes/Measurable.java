package shapes;

public interface Measurable {
    int length = 0;
    int width = 0;
    double getPerimeter(int length, int width);
    double getArea(int length, int width);
}
