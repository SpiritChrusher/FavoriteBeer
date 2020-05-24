package Backend_Beer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.List;

public class BeerDAO {

    public static BeerPOJO[] ReadBeers() throws IOException, URISyntaxException {
        InputStream jsonfile = ClassLoader.getSystemClassLoader().
                getResourceAsStream("AllBeers.json");
        BeerPOJO[] bj = new Gson().fromJson(new InputStreamReader(jsonfile), BeerPOJO[].class);

        return bj;
    }

    public static List<BeerPOJO> ReadBeers2() throws IOException, URISyntaxException {
        InputStream jsonfile = ClassLoader.getSystemClassLoader().
                getResourceAsStream("AllBeers.json");
        List<BeerPOJO> bj = new Gson().fromJson(new InputStreamReader(jsonfile), new TypeToken<List<BeerPOJO>>(){}.getType());

        return bj;
    }
}
