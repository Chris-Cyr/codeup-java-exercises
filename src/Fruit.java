import java.util.ArrayList;

public class Fruit {

    public static void main(String[] args) {
        ArrayList<String> Fruit = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Mango");

        Fruit.add(fruits.toString());

        System.out.println(fruits);
        System.out.println(Fruit);
    }
}
