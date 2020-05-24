package Backend_Beer;

import com.google.gson.Gson;
import org.tinylog.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BeerSeacher {

    public static int RandomNumber()
    {
        return ThreadLocalRandom.current().nextInt(0, 160 + 1);
    }


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

    public static ArrayList<BeerPOJO> Favorite_types(List<String> options, BeerPOJO[] bj) throws IOException, URISyntaxException {





        ArrayList<BeerPOJO> yourbeers = new ArrayList<>();


        for (var elem : bj)
        {
            int same = 0;
            for (var word : options) {

                for (var another : elem.getTaste()){

                    if (word.equals(another))
                    {
                        same++;
                    }
                }
                int tastepiece = elem.getTaste().length;

            }
            if(same >= 2 && same >= options.size()-1)
            {
                yourbeers.add(elem);
            }

        }


        return yourbeers;
    }

    public static String Bestbeer(ArrayList<BeerPOJO> yourbeers) throws IOException, URISyntaxException {
        if(yourbeers.size() > 0) {
            for (var i : yourbeers) {
                i.calcutale_pricevalue();
            }

            var best = yourbeers.stream().max(Comparator.comparingDouble(BeerPOJO::calcutale_pricevalue)).get().getName();
            return best;
        }

        BeerPOJO[] yours = BeerDAO.ReadBeers();

        String best = yours[BeerSeacher.RandomNumber()].getName();

        Logger.warn("The selected options list didn't match a beer, so I created: " + best);
        return best;
    }

}

