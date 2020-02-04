package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;

    public Movie (String name, String category){
        this.name = name;
        this.category = category;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String inputCategory){
        this.category = inputCategory;
    }
}
