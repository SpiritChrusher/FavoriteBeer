package Backend_Beer;

import java.util.ArrayList;

public class BeerSeacher {

    public static double Price_value(BeerPOJO actual)
    {
        double beerpoints = 0;

    for (var a : actual.getType())
    {
       for (Beertypes b : Beertypes.values())
       {
           if (a.toLowerCase().equals(b.getName()))
           {
               beerpoints += b.getValue();
           }
       }
    }

        return ((actual.getQuality()*beerpoints)/actual.getPrice())*100;
    }

    public ArrayList<BeerPOJO> Favorite_types(){

        ArrayList<BeerPOJO> yourbeers = new ArrayList<>();


        return yourbeers;
    }
}
