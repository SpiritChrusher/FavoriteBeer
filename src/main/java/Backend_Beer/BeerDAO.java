package Backend_Beer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

/**
 * Handles the json file reading.
 */

public class BeerDAO {
    /**
     *
     * @return all the beers from the json file as a Beer type list
     */

    public static List<Beer> ReadBeers() {
        List<Beer> readBeers = new ArrayList<>();
        InputStream allBeers = ClassLoader.getSystemClassLoader().getResourceAsStream("all_beers.json");
        if (nonNull(allBeers)) {
            readBeers = new Gson().fromJson(new InputStreamReader(allBeers), new TypeToken<List<Beer>>() {
            }.getType());
        }

        return readBeers;
    }
}
