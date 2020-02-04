import java.util.Scanner;

public class MethodExercises {

    public static void main(String args[]) {
//        sayHello("Hello", "Chris!");
//        addition(70, 7);
//        subtraction(70, 7);
//        multiplication(70, 7);
//        division(70, 7);
//        modulus(70, 8);
//        getInteger(1, 10);
//        factorial(1);
//        dice(1);
//        binary();
        binarySum("10","11");
        System.out.print(binarySum("10", "11"));
    }

    //    EXERCISE 1------------->
    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }

    public static double addition(long num1, long num2) {
        long sum = num1 + num2;
        System.out.println("Addition method: " + sum);
        return sum;
    }

    public static double subtraction(long num1, long num2) {
        long sub = num1 - num2;
        System.out.println("Subtraction method: " + sub);
        return sub;
    }

    public static double multiplication(long num1, long num2) {
        long product = num1 * num2;
        System.out.println("Multiplication method: " + product);
        return product;
    }

    public static double division(long num1, long num2) {
        long divided = num1 / num2;
        System.out.println("Division method: " + divided);
        return divided;
    }

    public static double modulus(long num1, long num2) {
        long multiple = num1 % num2;
        System.out.println("Modulus method: " + multiple);
        return multiple;
    }

    //    EXERCISE 2!-------------->
    public static int getInteger(int min, int max) {
        Scanner getInteger = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("That number is between 1 and 10!");
            System.out.println("Goodbye!");
            return userInput;
        } else {
            System.out.println("That number is not between 1 and 10!");
            System.out.println("Try Again!");
            getInteger(min, max);
            return userInput;
        }
    }

    //    EXERCISE 3!--------------->
    public static long factorial(long num1) {
        Scanner getNum = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 65: ");
        num1 = getNum.nextInt();
        System.out.println("Would you like to continue? [Press 1 for Yes | Press 2 for No]");
        int confirm = getNum.nextInt();
        String output = "! = 1";
        System.out.printf("1%s\n", output);

        boolean confirmation = (confirm == 1) && (num1 <= 65) && (num1 >= 1);
        if (confirmation) {
            long fact = 1;
            for (int i = 1; i <= num1; i++) {
                fact *= i;
                output += " X " + i;
                System.out.printf("%d%s = %d\n", i, output, fact);
            }
            System.out.print(num1 + "! = " + fact);
            return fact;
        } else {
            System.out.println("Make Sure 3 Things: Number between 1-10, Press 1 for Yes, Profit");
            factorial(num1);
        }
        return num1;
    }

    //    EXERCISE 4!--------------->
    public static long dice(long num1) {
        Scanner getnum = new Scanner(System.in);
        System.out.print("Enter the number of sides one of your di: ");
        num1 = getnum.nextInt();
        System.out.println("Type 1 to roll the dice! ");
        int num17 = getnum.nextInt();
        boolean confirmation = (num17 == 1);
        if (confirmation) {
            int dice1 = (int) Math.ceil(num1 * java.lang.Math.random());
            int dice2 = (int) Math.ceil(num1 * java.lang.Math.random());
            double diceRoll = ((num1 * java.lang.Math.random()));
            long diceResult = (Math.round(diceRoll));
            System.out.println("You rolled " + dice1 + " & " + dice2 + "!");
            System.out.println("Play again? 1 for Yes | 2 for No");
            int playAgain = getnum.nextInt();
            boolean confirm = (playAgain == 1);
            if (confirm) {
                dice(num1);
            } else {
                System.out.println("Goodbye");
                return diceResult;
            }
        } else {
            System.out.println("You failed, Goodbye");
            return num17;
        }
        return (num1);
    }

//    EXERCISE 5!------------------->
    public static void binary (){
        Scanner binScan = new Scanner (System.in);
        System.out.println("Please enter the first binary number: ");
        long bin1 = binScan.nextInt();
        System.out.println("Please enter the second binary number: ");
        long bin2 = binScan.nextInt();
        int i = 0, carry = 0;
        int [] sum = new int [10];
        while (bin1 !=0 || bin2 !=0)
        {
            sum[i++] = (int)((bin1 % 10 + bin2 % 10 + carry) % 2);
            carry = (int)((bin1 % 10 + bin2 % 10 + carry) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }
        if (carry != 0) {

            sum [i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

    }
    public static String binarySum(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second,2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

}