import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class newFile {

    public static void main(String[] args) {
    newFile();
    readWriteFile();
    }
    public static void newFile (){
    String filename = "info.txt";
    String directory = "data";

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);



        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories((dataDirectory));
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    static void readWriteFile(){
        List<String> fruit = null;
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            fruit = Files.readAllLines(groceries);
            for (String line : fruit) {
            System.out.println(line);
        }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        fruit.add("Watermelon"); fruit.add("Mango"); fruit.add("Tomato");
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            Files.write(groceries,fruit);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    static void readFile(){
        try {
            Path poemFile = Paths.get("europa", "poem.txt");
            List<String> poemLines = Files.readAllLines(poemFile);


        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
