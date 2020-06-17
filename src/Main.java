import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(coinTotal(24));
    }
    public static int coinTotal(int totalAmount){
        int coin1 = 1;
        int coin3 = 3;
        int coin5 = 5;
        int numberOfCoins = 0;

        while(totalAmount > 0){
            if(totalAmount / coin5 >= 1){
                numberOfCoins += 1;
                totalAmount -= 5;
            }else if (totalAmount / coin3 >= 1){
                numberOfCoins += 1;
                totalAmount -= 3;
            }else {
                numberOfCoins += 1;
                totalAmount -= 1;
            }
        }
        return numberOfCoins;
    }

}