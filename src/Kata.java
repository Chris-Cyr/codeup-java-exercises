public class Kata {
    public static void main(String[] args) {
        System.out.println(solution("Potato Man"));
    }
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}