public class InterviewPractice {

    public static void main(String[] args) {
        System.out.println("You will use " + coinTotal(2235)+ " coins!");
    }

    public static int coinTotal(int totalAmount) {
        int coin1 = 1;
        int coin3 = 3;
        int coin5 = 5;
        int numberOfCoins = 0;

        while(totalAmount > 0) {
          if (totalAmount / coin5 >= 1){
            numberOfCoins += 1;
            totalAmount -= 5;
          } else if (totalAmount /coin3 >= 1){
              numberOfCoins += 1;
              totalAmount -= 3;
          } else if (totalAmount / coin1 >= 1){
              numberOfCoins += 1;
              totalAmount -= 1;
          }
        }
        return numberOfCoins;
    }
}
