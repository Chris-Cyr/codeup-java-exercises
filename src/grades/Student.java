package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private String gitHubName;
    private ArrayList<Double> grades = new ArrayList<>();


    public static void main(String[] args) {
        ArrayList<Double> chrisGrades = new ArrayList<>();
        Student chris = new Student("Chris", chrisGrades, "chriso17");
        chrisGrades.add(100.00);
        chrisGrades.add(80.00);
        chrisGrades.add(60.00);
        System.out.printf("%s's grades are: " + chrisGrades + ".\n", chris.name);
        System.out.printf("%s's average is: " + chris.getGradeAverage(chrisGrades), chris.name);
    }

    public Student(String name, ArrayList <Double> grades, String gitHubName) {
        this.name = name;
        this.grades = grades;
        this.gitHubName = gitHubName;
    }

    public void setName(String name) {
        this.name = name;
        addGrade(grades);
    }

    public String getName() {
        return this.name;
    }

    public String getGitHubName() {
        return this.gitHubName;
    }

    public void addGrade(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double getGradeAverage(ArrayList<Double> grades) {
        Double sum = 0.0;
        if (!grades.isEmpty()) {
            for (Double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
        return sum;
    }
}
