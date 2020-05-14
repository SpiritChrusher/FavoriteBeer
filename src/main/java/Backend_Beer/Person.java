package Backend_Beer;

import lombok.*;

import java.util.ArrayList;

@lombok.Data
public class Person {

    private String name;

    private String[] taste;

    private ArrayList<BeerPOJO> favoritebeers;

    public Person(String aname, String[] ataste, ArrayList<BeerPOJO> afavorite)
    {
        name = aname;
        taste = ataste;
        favoritebeers = afavorite;
    }

    public Person(String aname)
    {
    name = aname;
    }


}
