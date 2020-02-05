package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("The perimeter of the rectangle is : " +box1.getPerimeter(4,5));
//        System.out.println("The area of the rectangle is : " +box1.getArea(4,5));
//
//        Square box2 = new Square(5);
//        System.out.println("The perimeter of the square is : " + box2.getPerimeter());
//        System.out.println("The area of the square is : " + box2.getArea());

        Measurable myShape = new Square(7);
        System.out.println("This perimeter of the square is: " + myShape.getPerimeter());
        System.out.println("This perimeter of the square is: " + myShape.getArea());

        Measurable myShape2 = new Rectangle(7,10);
        System.out.println("This perimeter of the rectangle is: " + myShape2.getPerimeter());
        System.out.println("This area of the rectangle is: " + myShape2.getArea());
    }
}
