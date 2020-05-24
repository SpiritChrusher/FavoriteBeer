package Backend_Beer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;

public class BeerDAO {

    public static BeerPOJO[] ReadBeers2() throws IOException, URISyntaxException {
        InputStream jsonfile = ClassLoader.getSystemClassLoader().
                getResourceAsStream("AllBeers.json");
        BeerPOJO[] bj = new Gson().fromJson(new InputStreamReader(jsonfile), BeerPOJO[].class);

        return bj;
    }

    public static List<BeerPOJO> ReadBeers() throws IOException, URISyntaxException {

        System.out.println("futok!");



        InputStream jsonfile = ClassLoader.getSystemClassLoader().
                getResourceAsStream("AllBeers.json");
        System.out.println(jsonfile);

       /* try {
            File myObj = new File("Common/Allbeers.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        List<BeerPOJO> bj = new Gson().fromJson(new InputStreamReader(jsonfile), new TypeToken<List<BeerPOJO>>(){}.getType());

        return bj;
    }
}
