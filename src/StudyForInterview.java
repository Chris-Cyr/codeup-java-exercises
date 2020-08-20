import java.util.Scanner;

public class StudyForInterview {

    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please Enter A Number Between 1 - 100: ");
        int userNumber = inputScanner.nextInt();
         if (userNumber > 100 || userNumber < 0){
             System.out.println("That is not a number between 1 - 100. Please try again");
             fizzBuzz();
         }else if(userNumber % 15 == 0){
             System.out.println("FizzBuzz");
             fizzBuzz();
         }else if (userNumber % 5 == 0){
             System.out.println("Buzz");
             fizzBuzz();
         }else if (userNumber % 3 == 0){
             System.out.println("Fizz");
             fizzBuzz();
         }else {
             System.out.println(userNumber);
             fizzBuzz();
         }

    }
}
