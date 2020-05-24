package Backend_Beer;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.*;
import java.net.URISyntaxException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BeerSearcherTest {

    @Test
    public void priceTest()
    {
    BeerPOJO beer = new BeerPOJO("favbeer", new String[]{"ale", "IPA"}, 6.0, 700);
        MathContext m = new MathContext(3);
        BigDecimal output = new BigDecimal(BeerSeacher.Price_value(beer)).round(m);

    assertEquals(6.43,output.doubleValue());
    }

    @Test
    public void favoritetypeTest() throws IOException, URISyntaxException {

        List<BeerPOJO> testbeers = new ArrayList<>();

        testbeers.add(new BeerPOJO("Beertailor Porter", 5.0,
                new String[] {"pleasing", "cocoa taste", "biscuit taste", "slightly bitter", "creamy", "moderately easy to drink"},
                "Hungary", new String[] {"ale", "porter"},"Beertailor", "semi complex", 1000,
                7.5, new String[]{"Online"}, 0.33));
        testbeers.add(new BeerPOJO("Beertailor Pils", 5.0,
                new String[] {"pleasing", "easy to drink","bread yeast taste", "slightly gassy", "fruity"},
                "Hungary", new String[] {"lage", "american lager", "pils"},"Beertailor", "semi complex", 770,
                6.0, new String[]{"Online"}, 0.33));
        testbeers.add(new BeerPOJO("Beertailor Pils", 5.0,
                new String[] {"pleasing", "easy to drink","bread yeast taste", "slightly gassy", "fruity"},
                "Hungary", new String[] {"lage", "american lager", "pils"},"Beertailor", "semi complex", 770,
                6.0, new String[]{"Online"}, 0.33));

        ArrayList<String> list = new ArrayList<String>();
        list.add("pleasing");
        list.add("easy to drink");
        list.add("bread yeast taste");
        list.add("slightly gassy");


        BeerSeacher a = new BeerSeacher();

        List<BeerPOJO> output = a.Favorite_types(list, testbeers);

        String out2 = BeerSeacher.Bestbeer(output);
        assertEquals(2, output.size());
        assertEquals("Beertailor Pils", out2);
    }

}
