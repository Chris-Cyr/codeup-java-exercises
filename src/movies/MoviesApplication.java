package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie [] movieDataBase = MoviesArray.findAll();
        System.out.println("What would you like to do? \n" + "\n" + "0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category\n" + "\n");
        while(true)
            switch(input.getInt("Enter your choice: ")) {
            case 0:
                return;
            case 1:
                for (Movie movie : movieDataBase) {
                    System.out.println(movie.getName() + " : " + movie.getCategory());
                }
                break;

            case 2:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory() == "animated") {
                        System.out.println(movie.getName() + " : " + movie.getCategory());
                    }
                }
                break;
            case 3:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory() == "drama") {
                        System.out.println(movie.getName() + " : " + movie.getCategory());
                    }
                }
                break;
            case 4:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory() == "horror") {
                        System.out.println(movie.getName() + " : " + movie.getCategory());
                    }
                }
                break;
            case 5:
                for (Movie movie : movieDataBase) {
                    if (movie.getCategory() == "scifi") {
                        System.out.println(movie.getName() + " : " + movie.getCategory());
                    }
                }
                break;

        }
    }
}
