package Backend_Beer;

import org.tinylog.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class to find what is the best beer for the user's taste.
 */

public class Beerseacher {

    /**
     *
     * @param actual the beer that the method is checking
     * @return that beer's pricevalue
     */

    public static double price_Value(Beer actual)
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

    /**
     *
     * @param options the list of the chosen taste options by the user
     * @param all_beer the list of all the beers in the json file
     * @return all the beers that matches the taste options
     */

    public static List<Beer> Favorite_types(List<String> options, List<Beer> all_beer)  {

        ArrayList<Beer> your_beers = new ArrayList<>();


        for (var elem : all_beer)
        {
            int same = 0;
            for (var word : options) {

                for (var another : elem.getTaste()){

                    if (word.equals(another))
                    {
                        same++;
                    }
                }
            }
            if(same >= 2 && same >= options.size()-1)
            {
                your_beers.add(elem);
            }

        }
        return your_beers;
    }

    /**
     *
     * @param your_beers the list of the best possible beers
     * @return the name of the best beer for the user
     */

    public static String Bestbeer(List<Beer> your_beers)  {

        if(your_beers.size() > 0) {
            for (var i : your_beers) {
                i.calcutale_pricevalue();
            }
         return your_beers.stream().max(Comparator.comparingDouble(Beer::calcutale_pricevalue)).get().getName();
        }

        Logger.warn("The selected options didn't match any beer.");
        return "Selected options didn't match any beers";
    }

}

