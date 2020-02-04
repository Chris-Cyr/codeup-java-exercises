import java.lang.reflect.TypeVariable;
import java.util.Scanner;

public class HighLow {
    public static void main(String args[]) {
//        hiLo(1);
//        celebrationDots(100);
        textAdventure();

    }

    public static long hiLo(long userNumber) {
        Scanner numScanner = new Scanner(System.in);
        int randoNum = (int) Math.ceil(100 * java.lang.Math.random());
        System.out.println("Guess a number between 1 and 100: ");
        userNumber = numScanner.nextInt();
        if (userNumber > 100 || userNumber < 1) {
            System.out.println("That's not a valid number fool. Try again tho...");
            hiLo(userNumber);
        } else {
            do {
                if (userNumber > randoNum) {
                    System.out.println("LOWER: ");
                    userNumber = numScanner.nextInt();

                }
                if (userNumber < randoNum) {
                    System.out.println("HIGHER: ");
                    userNumber = numScanner.nextInt();
                }
                if (userNumber == randoNum) {
                    System.out.println("YOU DID IT! " + randoNum + " IS RIGHT!");
                    System.out.println("Play Again? Yes = 1 No = 2: ");
                    int replayNumber = numScanner.nextInt();
                    boolean goodAnswer = replayNumber == 1;
                    if (goodAnswer) {
                        hiLo(userNumber);
                    } else {
                        System.out.println("Later Gator");
                        return randoNum;
                    }
                }
            } while (userNumber != randoNum);
        }
        return userNumber;
    }
    public static void playDots (int numberOfDots){
        for(int i = 0; i< numberOfDots; i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(".");
        }
    }

    public static void celebrationDots (int numberOfDots){
        for(int i = 0; i< numberOfDots; i++){
            try{
                Thread.sleep(25);
            }catch (Exception e){
                System.out.println(e);
            }
            String output = "";
            for(int j = 0; j<i+1; j++){
                output += ".";
            }
            System.out.println(output);
        }
        for(int k = numberOfDots; k > 0; k--){
            try{
                Thread.sleep(25);
            }catch (Exception e){
                System.out.println(e);
            }
            String output = "";
            for(int m = 0; m<k; m++){
                output += ".";
            }
            System.out.println(output);

        }
    }







    public static void textAdventure() {
        Scanner textScan = new Scanner(System.in);
        System.out.println("Welcome to Death Crossing");
        System.out.println("Even though you'll be dead soon, please enter a name we can put on your tombstone: ");
        String userName = textScan.nextLine();
        System.out.println("Welcome to Death Crossing, " + userName + ".");
        System.out.println("So, " + userName + " this sidewalk is safe...mostly...");
        System.out.println("Across the street is a lady, she's about to kill that chicken she's holding " + userName + ".");
        System.out.println("Do you want to cross the road to help save the chicken or do you want to stay on the sidewalk with me?");
        System.out.println("Hero or Sidewalk?:");
        String answer = (textScan.nextLine());
        boolean confirmationH = answer.toLowerCase().startsWith("h");
        boolean confirmationS = answer.toLowerCase().startsWith("s");
        if (confirmationH) {
            System.out.println("You have chosen to play in traffic to save a chicken...");
            playDots(4);
            System.out.println("Although not impressively, You have played in traffic successfully");
            System.out.println("A quick decision must be made...you can wrestle the chicken from the woman's arms or punch her");
            System.out.println("Wrestle or Punch?");
            String answer2 = (textScan.nextLine());
            boolean confirmationW = answer2.toLowerCase().startsWith("w");
            boolean confirmationP = answer2.toLowerCase().startsWith("p");
            if (confirmationP) {
                System.out.println("You have chosen to punch a woman over a chicken... some hero you are...");
                for (int i = 0; i < 15; i++) {
                    System.out.println(".");
                }
                System.out.println("Your willingness to debase your morality has saved the life of a chicken");
                System.out.println("What shall you name your new chicken?:");
                String chickenName = (textScan.nextLine());
                for (int i = 0; i < 15; i++) {
                    System.out.println(".");
                }
                System.out.println("Really? A chicken named " + chickenName + "? Ok...");
                System.out.println("Well you and " + chickenName + " better run Hero because Mama's waking up!");
                System.out.println("You should run...for sure...but you could try to kiss her and maybe you'll get married...");
                System.out.println("Kiss or Run?:");
                String answer3 = (textScan.nextLine());
                boolean confirmationK = answer3.toLowerCase().startsWith("k");
                boolean confirmationR = answer3.toLowerCase().startsWith("r");
                if (confirmationR) {
                    System.out.println("You and " + chickenName + " have chosen to run...");
                    for (int i = 0; i < 15; i++) {
                        System.out.println(".");
                    }
                    System.out.println("You and " + chickenName + " have chosen correctly! And apart from punching a woman, you've proven yourself a hero, " + userName + "! Well done :)");
                    System.out.println("You now have the option to celebrate....so...yes or no?");
                    String answer4 = (textScan.nextLine());
                    boolean confirmationY = answer4.toLowerCase().startsWith("y");
//                    String output = "../^*^\\\\..";
//                    System.out.printf("%s\n", output);
                    if (confirmationY) {
                        celebrationDots(100);
                        celebrationDots(100);
                        celebrationDots(100);
                    } else {
                        System.out.println("You're Boring.....");
                        System.out.println("Bye.....");
                    }
                }
                if (confirmationK) {
                    System.out.println("You think kissing someone you just punched over a chicken is going to work? I like your thinking..let's see");
                    for (int i = 0; i < 15; i++) {
                        System.out.println(".");
                    }
                    System.out.println("You've been arrested for assault and jaywalking, the chicken is dead, and now you're a hero only to your bunkmate...");
                    System.out.println("Game over moron...");
                    System.out.println("I'll let you play again so you can learn right from wrong...");
                    System.out.println("Deal?: ");
                    String answer5 = (textScan.nextLine());
                    boolean confirmationY = answer5.toLowerCase().startsWith("y");
                    if (confirmationY) {
                        textAdventure();
                    } else {
                        System.out.println("Nevermind you're a boring creep anyway baiiiiiiiiiiii");
                    }
                }
            }
            if (confirmationW) {
                System.out.println("You think you can wrestle? We shall see...");
                for (int i = 0; i < 15; i++) {
                    System.out.println(".");
                }
                System.out.println("Chicken lady had a knife and stabbed you to death...then stabbed the chicken...oh maiii");
                System.out.println("Rest in Peace and all that but, based on your decisions I don't think you should play this game ever again..");
                System.out.println("R.I.P. " + userName);
            }
        }
            if (confirmationS) {
                System.out.println("You chose the sidewalk like a chump...");
                for (int i = 0; i < 15; i++) {
                    System.out.println(".");
                }
                System.out.println("Give me your money Chump!");
                System.out.println("Money or Run?");
                String answer7 = (textScan.nextLine());
                boolean confirmationM = answer7.toLowerCase().startsWith("m");
                boolean confirmationR = answer7.toLowerCase().startsWith("r");
                if (confirmationM) {
                    System.out.println("You have chosen to give me your money like a Jabroni...");
                    for (int i = 0; i < 15; i++) {
                        System.out.println(".");
                    }
                    System.out.println("DAMN STRAIGHT! Now walk away..");
                    for (int i = 0; i < 15; i++) {
                        System.out.println(".");
                    }
                    System.out.println("BOOM!!!!!!! A car has lost control and went careening onto the curb tossing my body into the air like a dandelion :(");
                    System.out.println("How could you just let me die like that? ");
                    System.out.println("I think you should walk away now...");
                }
                if (confirmationR) {
                    System.out.println("*You Run*");
                    for (int i = 0; i < 15; i++) {
                        System.out.println(".");
                    }
                    System.out.println("Did you forget about the chicken? He's dead now Hero...How do you live with yourself?");
                    System.out.println("Even though there's little hope for you, " + userName + " would you like to try again?");
                    System.out.println("Yes or No?:");
                    String cont = (textScan.nextLine());
                    boolean contY = cont.toLowerCase().startsWith("y");
                    if (contY) {
                        textAdventure();
                    } else {
                        System.out.println("Later Gator");
                    }
                }

            }
        }
    }

