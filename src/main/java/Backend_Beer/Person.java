package Backend_Beer;

import lombok.*;

import java.util.ArrayList;

public class Person {

    private String name;



    private ArrayList<String> favoritebeers = new ArrayList<>();

    public Person(){}

    public Person(String name){ //, ArrayList<String> favoritebeers) {
        this.name = name;

 //       this.favoritebeers = favoritebeers;
    }
    public void addtoList(String a)
    {
        favoritebeers.add(a);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getFavoritebeers() {
        return favoritebeers;
    }

    public void setFavoritebeers(ArrayList<String> favoritebeers) {
        this.favoritebeers = favoritebeers;
    }

}
