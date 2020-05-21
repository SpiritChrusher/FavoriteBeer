package Backend_Beer;

public enum BeerTastes
{

    PLEASING("pleasing", 10),
    EASY_TO_DRINK("easy to drink", 10);




    private final String tastename;   // in kilograms
    private final double value; // in meters
    BeerTastes(String tastename, double value) {
        this.tastename = tastename;
        this.value = value;
    }
    private String typename() { return tastename; }
    private double value() { return value; }

    public String getName()
    {
        return this.tastename;
    }
    public double getValue()
    {
        return this.value;
    }
}