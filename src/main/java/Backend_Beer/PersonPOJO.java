package Backend_Beer;

import java.util.ArrayList;

/**
 * Class to represent the current user.
 */
public class PersonPOJO {


    private String name;


    private ArrayList<String> favoritebeers = new ArrayList<>();

    public PersonPOJO(){}

    public PersonPOJO(String name){
        this.name = name;
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
