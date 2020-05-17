package Backend_Beer;

import lombok.*;

import java.util.ArrayList;


//@lombok.Data
public class Person {

    private String name;

    private String[] taste;

    private ArrayList<BeerPOJO> favoritebeers;

    public Person(){}

    public Person(String name, String[] taste, ArrayList<BeerPOJO> favoritebeers) {
        this.name = name;
        this.taste = taste;
        this.favoritebeers = favoritebeers;
    }

    public Person(String aname)
    {
    name = aname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTaste() {
        return taste;
    }

    public void setTaste(String[] taste) {
        this.taste = taste;
    }

    public ArrayList<BeerPOJO> getFavoritebeers() {
        return favoritebeers;
    }

    public void setFavoritebeers(ArrayList<BeerPOJO> favoritebeers) {
        this.favoritebeers = favoritebeers;
    }
}
