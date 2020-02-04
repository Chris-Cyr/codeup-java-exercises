import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] people = {
                new Person("Chris"),
                new Person("John"),
                new Person("Will")
        };
        personArray(people);
        Person[] newPeople = addPerson(people, new Person("Jabroni Sandwich"));
        personArray(newPeople);
        }
    public static void personArray(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    }

    public static Person[] addPerson (Person[] people, Person inputPerson){
        Person[] returnPeople = Arrays.copyOf(people, people.length+1);
        returnPeople[people.length]=inputPerson;
        return returnPeople;

    }
}