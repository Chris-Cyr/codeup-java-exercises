import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

//public class ConsoleExercises {
//    static public void main(String[] args){
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately: %,.2f%n", pi);

//        SCANNERS--------------------->
//        Scanner scanner = new Scanner(System.in);
//
//        int i=0;
//        while (i != -1) {
//            System.out.print("Enter an integer: ");
//            try{
//                i = scanner.nextInt();
//                System.out.println("You entered: --> \"" + i + "\" <--");
//            } catch (InputMismatchException ime) {
//                System.out.println("This is not an integer");
//                i = 0;
//            }
//        }
//        STRING ------------->
//        Scanner threeWords = new Scanner(System.in);
//        System.out.print("Enter 3 Words:");
//
//        String userInput1 = threeWords.nextLine();
//        String userInput2 = threeWords.nextLine();
//        String userInput3 = threeWords.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput1 + userInput2 + userInput3 + "\" <--");
//
//        Scanner userString = new Scanner(System.in);
//        System.out.print("Please Enter A String: ");
//
//        String userInput = userString.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        AREA OF ROOM----->
//        Scanner roomLength = new Scanner(System.in);
//        System.out.print("Enter the Length of the Room in Feet: ");
//
//        double userLength = roomLength.nextDouble();
//
//        Scanner roomWidth = new Scanner(System.in);
//        System.out.print("Enter the Width of the Room in Feet: ");
//
//        double userWidth = roomWidth.nextDouble();
//
//
//        double roomPerimeter = userLength + userLength + userWidth + userWidth;
//        double roomArea = userLength * userWidth;
//        double roomVolume = Math.pow(roomArea, 3);
//        System.out.println("The Area of the Room is: --> " + roomArea + "ft <--");
//        System.out.println("The Perimeter of the Room is: --> " + roomPerimeter + "ft <--");
//        System.out.println("The Volume of the Room is: --> " + roomVolume + "ft <--");

//
//    }
//}