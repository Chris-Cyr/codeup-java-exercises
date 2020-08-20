import java.util.Scanner;

public class StudyForInterview {

    public static void main(String[] args) {
//        fizzBuzz();
//        reverseString();
        reverseSentence();
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

    public static void reverseString() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please insert a string");
        String userInput = inputScanner.nextLine();
        char[] in = userInput.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        System.out.println(new String(in));
        reverseString();
    }

    public static void reverseSentence() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String userInput = inputScanner.nextLine();
        String[] words = userInput.split(" ");
        String rev = "";
        for(int i = words.length -1; i >= 0; i--)
        {
            rev += words[i] + " ";
        }
        System.out.println(rev);
        reverseSentence();

    }
}
