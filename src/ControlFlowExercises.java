import java.util.Scanner;

//
public class ControlFlowExercises {
    static public void main(String[] args) {
        long sum = 0;
        long num1 = 7;
        for (long i = 1; i <= num1; i++) {
            sum += 1;
        }


        //        int i = 5;
//        while (i <= 15) {
//            System.out.println("i = " + i);
//            i++;
//        }
//    }
//}
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//    }
//}

//    long i = 2;
//        do {
//        System.out.println(i);
//        i *= i;
//    }while (i <= 1000000);

//        for(long i=5; i<=15; i++){
//            System.out.println(i);
//        }
//
//        for(long i = 2; i <= 10000000; i*=i) {
//            System.out.println(i);
//        }

//        for(long i = 1; i <= 100; i++){
//            if(i % 5 == 0 && i % 3 == 0)
//                System.out.println("FizzBuzz");
//            else if(i % 5 == 0)
//                System.out.println("Buzz");
//            else if(i % 3 == 0)
//                System.out.println("Fizz");
//            else
//                System.out.println(i);
//        }

//        INTEGERSSSSS ----------------------->
//        Scanner table = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        long userLowNumber = table.nextLong();
//        System.out.println("What number would you like to go to? ");
//        long userHighNumber = table.nextLong();
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        if (userLowNumber < 10) {
//            for (long i = userLowNumber; i <= userHighNumber; i++) {
//                long inputSquared = i * i;
//                double inputCubed = Math.pow(i, 3);
//                System.out.printf("%-6d | %-7d | %,.0f%n", i, inputSquared, inputCubed);
//            }
//        }
//    }

        //        GRADES ---------->
        Scanner grades = new Scanner(System.in);
        System.out.println("Please enter a grade from 0 to 100: ");
        int userGrade = grades.nextInt();
//        System.out.println("Would you like to continue? [y/N]");
//        String userInput = grades.next();
//        boolean confirmation = userInput.equals("y");
        int i = userGrade;
//        if (confirmation) {
            if (i < 0) {
                System.out.println("You've failed to a stunning degree!");
            } else if (i <= 59) {
                System.out.println("Your grade is an F! The World Needs Plenty of Garbagemen!");
            } else if (i <= 61) {
                System.out.println("Your grade is a D-! Let's Just Call it F!");
            } else if (i <= 64) {
                System.out.println("Your grade is a D! Why not A?");
            } else if (i <= 66) {
                System.out.println("Your grade is a D+! Why not A?");
            } else if (i <= 68) {
                System.out.println("Your grade is a C-! Why not A?");
            } else if (i <= 77) {
                System.out.println("Your grade is a C! Why not A?");
            } else if (i <= 79) {
                System.out.println("Your grade is a C+! Why not A?");
            } else if (i <= 81) {
                System.out.println("Your grade is an B-! Not Real B!");
            } else if (i <= 85) {
                System.out.println("Your grade is an B! Why not A?");
            } else if (i <= 87) {
                System.out.println("Your grade is a B+! Why not A?");
            } else if (i <= 89) {
                System.out.println("Your grade is an A-! Not Real A!");
            } else if (i <= 98) {
                System.out.println("Your grade is an A! Why not A+?");
            } else if (i <= 100) {
                System.out.println("Your grade is an A+! You're Worthy?");
            } else if (i >= 101) {
                System.out.println("Your teacher is too easy! An F to humble you!   ");
            } else {
                System.out.println("No Grade For You!!");
            }
        }
    }
