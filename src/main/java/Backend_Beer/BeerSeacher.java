package Backend_Beer;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<BeerPOJO> Favorite_types(List<String> a) throws IOException, URISyntaxException {


        InputStream jsonfile = ClassLoader.getSystemClassLoader().
                getResourceAsStream("Mybeers_part.json");

        BeerPOJO[] bj = new Gson().fromJson(new InputStreamReader(jsonfile), BeerPOJO[].class);
        ArrayList<BeerPOJO> yourbeers = new ArrayList<>();

        Integer chosendb = a.size();
        for (var word : a)
        {
            for (var elem: bj) {
                int same = 0;
                for (var another: elem.getTaste())
                {
                    if (word.equals(another))
                    {
                        same++;
                    }
                }
                int tastepiece = elem.getTaste().length;
                if(same >= chosendb-1 || same >= 2)
                {
                    yourbeers.add(elem);
                }
            }

        }
if (yourbeers.size() == 0)
{
    BeerPOJO sorike = new BeerPOJO("sorike");
    yourbeers.add(sorike);
}

        return yourbeers;
    }

}

