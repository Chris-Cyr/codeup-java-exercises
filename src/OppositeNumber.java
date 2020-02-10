public class OppositeNumber {

    public static void main(String[] args) {
        System.out.println(opposite(15));
        System.out.println(opposite(-100));
        System.out.println(opposite(0));
    }


    public static int opposite(int number) {
        if (number == 0) {
            return 0;
        } else
            return number * -1;
    }
}