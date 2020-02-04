import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");

//        byte num1 = 127;
//        short num2 = num1;
//        int num3 = num2;
//        long num4 = num3;
//
//        int bigNum1 = 200;
//        byte bigNum2 = (int) bigNum1;
//
//        float num5 = 3.33333333f;
//        double num6 = 3.141592;
//        int closeToNum6 = (byte) num6;
//        final double PI = 3.141592;
//
//
//        boolean yesNo = true;
//        yesNo = false;
//
//        char initial = 'C';
////        #newline
//        initial = '\n';


//        Syntax, Types, and Variable--------->
        int myFavoriteNumber = 17;
        System.out.println(" My favorite number is " + myFavoriteNumber + "!");

        String myString = "This is a string!";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);


//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        Wont't Work'------------>
//        String class = "Jabronitown";

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) "three";
        System.out.println(theNumberThree);
        System.out.println(o);
//        System.out.println(three);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(x);
//        System.out.println(y);
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

        long testLong = 2;
        System.out.println(testLong);

        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);


//        CONSOLE IO --------------->
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}