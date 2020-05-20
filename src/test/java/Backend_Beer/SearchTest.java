package Backend_Beer;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.*;
import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {
    @Test
    void priceTest()
    {
    BeerPOJO beer = new BeerPOJO("favbeer", new String[]{"ale", "IPA"}, 6.0, 700);
        MathContext m = new MathContext(3);
        BigDecimal output = new BigDecimal(BeerSeacher.Price_value(beer)).round(m);

    assertEquals(6.43,output.doubleValue());
    }


}
