import java.util.stream.*;
public class Codewars {

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