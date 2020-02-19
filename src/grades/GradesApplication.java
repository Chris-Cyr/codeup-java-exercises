package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        ArrayList<ArrayList<Double>> allGrades = new ArrayList<>();
        System.out.println(allGrades.size());



        ArrayList<Double> randyGrades = new ArrayList<>();
        randyGrades.add(100.);
        randyGrades.add(82.);
        randyGrades.add(90.);
        randyGrades.add(90.);
        Student randy = new Student("Randy \"Macho Man\" Savage", randyGrades, "OhYeahBrother");
        students.put("Randy", randy);
        allGrades.add(0,randyGrades);

        ArrayList<Double> dwayneGrades = new ArrayList<>();
        dwayneGrades.add(66.);
        dwayneGrades.add(69.);
        dwayneGrades.add(65.);
        dwayneGrades.add(64.);
        Student dwayne = new Student("Dwayne \"The Rock\" Johnson", dwayneGrades, "IfYaSmell");
        students.put("Dwayne", dwayne);
        allGrades.add(1,dwayneGrades);

        ArrayList<Double> steveGrades = new ArrayList<>();
        steveGrades.add(110.);
        steveGrades.add(110.);
        steveGrades.add(110.);
        steveGrades.add(110.);
        Student steve = new Student("Stone Cold Steve Austin", steveGrades, "StunningSteve316");
        students.put("Steve", steve);
        allGrades.add(2,steveGrades);

        ArrayList<Double> ricGrades = new ArrayList<>();
        ricGrades.add(50.);
        ricGrades.add(50.);
        ricGrades.add(50.);
        ricGrades.add(50.);
        Student ric = new Student("\"Slick\" Ric \"The Nature Boy\" Flair", ricGrades, "NatureWOO");
        students.put("Ric", ric);
        allGrades.add(3,ricGrades);

//        TERMINAL SCANNER ---------->
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the WWE Wrestling Terminal!!");
        System.out.println("../'***'\\..WWF../'***'\\..WWF../'***'\\..WWF../'***'\\..WWF../'***'\\..WWF../'***'\\..WWF../'***'\\..");
        System.out.println("Below are a list of usernames:");
        System.out.println("| " + students.get("Ric").getGitHubName() + " | " + students.get("Steve").getGitHubName() + " | " + students.get("Dwayne").getGitHubName() + "| " + students.get("Randy").getGitHubName());
        System.out.println("Enter one of the usernames to find out more about that wrestler or enter \"All\" to view the class average: ");
        String userInput = scanner.nextLine();
        while (true) {
            if(userInput.toLowerCase().equals("all")){
                System.out.println("The class average is: " + allGrades);
            }
            if (userInput.toLowerCase().equals("naturewoo")) {
                System.out.println("You have selected: " + students.get("Ric").getName() + "!");
                System.out.println("His grades were: " + students.get("Ric").getGrades(ricGrades));
                System.out.println("His gpa was: " + students.get("Ric").getGradeAverage(ricGrades));
                System.out.println("WOOOOOO!\n");
                System.out.println("Would you like to see another wrestler? Yes or No:");
                String userInput2 = scanner.nextLine();
                if (userInput2.toLowerCase().startsWith("n")) {
                    System.out.println("1....2....3! IT'S OVER!");
                    return;
                } else {
                    main(args);
                }
            }
            if (userInput.toLowerCase().equals("stunningsteve316")) {
                System.out.println("You have selected: " + students.get("Steve").getName() + "!");
                System.out.println("His grades were: " + students.get("Steve").getGrades(steveGrades));
                System.out.println("His gpa was: " + students.get("Steve").getGradeAverage(steveGrades));
                System.out.println("And that's the bottom line!\n");
                System.out.println("Would you like to see another wrestler? Yes or No:");
                String userInput3 = scanner.nextLine();
                if (userInput3.toLowerCase().startsWith("n")) {
                    System.out.println("1....2....3! IT'S OVER!");
                    return;
                } else {
                    main(args);
                }
            }
            if (userInput.toLowerCase().equals("ifyasmell")) {
                System.out.println("You have selected: " + students.get("Dwayne").getName() + "!");
                System.out.println("His grades were: " + students.get("Dwayne").getGrades(dwayneGrades));
                System.out.println("His gpa was: " + students.get("Dwayne").getGradeAverage(dwayneGrades));
                System.out.println("Check into the Rock Bottom Hotel at the corner \"Jabroni Avenue\" and \"Know Your Roll Wayy!!\"\n");
                System.out.println("Would you like to see another wrestler? Yes or No:");
                String userInput4 = scanner.nextLine();
                if (userInput4.toLowerCase().startsWith("n")) {
                    System.out.println("1....2....3! IT'S OVER!");
                    return;
                } else {
                    main(args);
                }
            }
            if (userInput.toLowerCase().equals("ohyeahbrother")) {
                System.out.println("You have selected: " + students.get("Randy").getName() + "!");
                System.out.println("His grades were: " + students.get("Randy").getGrades(randyGrades));
                System.out.println("His gpa was: " + students.get("Randy").getGradeAverage(randyGrades));
                System.out.println("The cream will rise to the top, brother!\n");
                System.out.println("Would you like to see another wrestler? Yes or No:");
                String userInput5 = scanner.nextLine();
                if (userInput5.toLowerCase().startsWith("n")) {
                    System.out.println("1....2....3! IT'S OVER!");
                    return;
                } else {
                    main(args);
                }
            } else {
                System.out.println("Sorry, I don't recognize that username...please try again:\n");
                main(args);
            }
        }
    }
}
