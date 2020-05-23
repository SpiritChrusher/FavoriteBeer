package Backend_Beer;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

public class BeerDAO {

    public static BeerPOJO[] ReadBeers() throws IOException, URISyntaxException {
        InputStream jsonfile = ClassLoader.getSystemClassLoader().
                getResourceAsStream("Mybeers_part.json");
        BeerPOJO[] bj = new Gson().fromJson(new InputStreamReader(jsonfile), BeerPOJO[].class);

        return bj;
    }
}
