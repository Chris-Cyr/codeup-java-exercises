import java.util.Date;

public class Student {
    static int numberOfStudents = 0;
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
        Student daniel = new Student("Daniel");
//        daniel.name = "Daniel";
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web Development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;


        Student zach = new Student("Zach");
//        zach.name = "Zach";
        zach.cohort ="Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;

        Student trant = new Student("Trant");
        trant.program = "Web Development";
        trant.cohort = "Deimos";
        trant.location = "San Antonio";
        trant.drinksCoffee = true;
        trant.report();

        System.out.println(daniel.report());
        System.out.println(zach.report());
        System.out.println(trant.report());
        System.out.printf("There are now %d students.\n", numberOfStudents);

//        if(zach.drinksCoffee)
//            System.out.println(zach.name + " drinks coffee");
    }

    public Student (String name){
        numberOfStudents ++;
        this.name = name;
        this.startDate = new Date();
    }

    public String report(){
        String output = "";
        output += "My name is " + this.name + ". ";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ". ";
        if(this.drinksCoffee)
            output += "I drink coffee in " + this.location + ".";
        else
            output += "I don't drink ocffee in " + this.location + ".";
        return output;


    }
}
