import java.lang.reflect.Array;
import java.util.stream.*;
public class Codewars {

    public static void main(String[] args) {
        int[] threeNumbers = {3,6,9}; //18 Even
        int[] fiveNumbers = {1,2,3,4,5}; //15 Odd
        int[] noNumbers = {};

        System.out.println(oddOrEven(threeNumbers));
        System.out.println(oddOrEven(fiveNumbers));
        System.out.println(oddOrEven(noNumbers));
    }



    public static String oddOrEven(int[] array) {
        // your code
        int sum = IntStream.of(array).sum();
        if (sum % 2 == 0) {
            return "even";
        } else if (sum == 0) {
            return "even";
        } else if (sum % 2 != 0) {
            return "odd";
        }
        return"";
    }
}
