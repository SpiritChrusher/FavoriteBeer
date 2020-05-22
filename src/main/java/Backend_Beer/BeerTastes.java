package Backend_Beer;

public enum BeerTastes
{
    HOPPYBITTER_AFTERTASTE("hoppybitter aftertaste");
   /* MALTY("malty"),
    NOT_STRONG("not strong")
    soft
            alcohol
    american hoppy
    bad
    basic lager taste
    belgian yeast taste
    biscuit taste
    bitter
            bittersweet
    brown beer taste
        caramel
    characteristicless taste
    chocolate taste
    citrus
    cocoa taste
    coffee taste
    corn aftertaste
    corn taste
    creamy
    czech type
    dark chocolate taste
    definitive IPA taste
        drinkable
    dry czech lager
        dry
    easy to drink
    english ale taste
        flossy
    fruity
    good english ale
    good lager
    grits
            heavy
    hoppy aftertaste
    hoppy
    interesting taste
    kicst alcohol
    lemony
            light
    malty
    mild roasted bitter taste
    mild wheatbeer taste
        mild
    mildlight beer
    moderately bitter
    moderately bitter
    moderately easy to drink
    moderately gassy
    moderately hoppy
    moderately sweet
    moderately wheatbeer taste
    not bitter
    not characteristic
    not fruity
    not gassy
    not half-brown
    not really tequila taste
    not strong taste
    not too strong
    not too bitter
    not too strong taste
    not too strong
    ordinary lager
    ordinary taste
    ordinary wheatbeer taste
    perfect for work
    pleasing fruity summer beer
    pleasing Germany lager
    pleasing summer beer
    pleasing taste
    pleasing taste
    pleasing wheatbeer
    pleasing
            pleasing
    rasberry syrup
    refreshing
    roasted aftertaste
    roasted middletaste
    roasted taste
    saazer hop
    slightly alcohol taste
    slightly banana aftertaste
    slightly bitter aftertaste
    slightly bitter beer
    slightly bitter red beer taste
    slightly bitter
    slightly bitter
    slightly brownbeer taste
    slightly caramel taste
    slightly caramel
    slightly chocolate taste
    slightly dunkel weissbier
    slightly fruity
    slightly gassy
    slightly hoppy
    slightly red beer taste
    slightly roasted
    slightly smoky
    slightly smoky
    slightly sour
    slightly stout taste
    slightly stoutos
    slightly sweet
    slightly sweet
    slightly tea taste
    slightly went wrong
    slightly wet
    slightly wet
    slightly wet aftertaste
    slightly wheatbeer taste
        smoky
    soft
            sour
    sour-cherry taste brown
    spicy wheatbeer
    spicy
    strange aftertaste
    strong caramel taste
    sweet aftertaste
    sweet
            tasty
    tea taste
    thick imperial stout
        thick
    unfiltered taste
    unique taste
    unique
    unpleasant aftertaste
    unpleasant aftertaste
    unpleasant bitter aftertaste
    vegyes taste
    very bad
    very bitter
    very bitter
    very coffee taste
    very gassy
    very heavy
    very interesting taste
    very mild
    very mint
    very sour aftertaste
    very strong
    verywet
    vomit aftertaste
    weak taste
    wheatbeer taste
    wheatbeer
            winy
    yeasty aftertaste
    yeasty
            awful
    balanced taste
    citrus
    coffee taste
    complex
            corn
    definitive lager
    easy to drink
        fruity
    good czech pils taste
    hoppy
    interesting taste
    light lager
    moderately bitter
    moderately pleasing
    pleasing
    riesling taste
    simple
    slight bitter aftertaste
    slightly bitter
    slightly brown beer taste
    slightly sour
    slightly sweet
    spicy
    strong coffee taste
        strong
    sweet
            unpleasant
    vanilla taste
    very complex
    bread yeast taste
    good red ale taste
    not too strong
    slightly bitter
    sour
    strong sichuan pepper taste
    basic czech lager
    basic german lager
    basic wheatbeer
    brown beer taste
        caramel
    citrus
            complex
    definitive czech beer
    definitive Germany beer
    definitive lager
    definitive wheatbeer taste
    easy to drink
        gassy
    hoppy
            lemony
    mild
    mildly bitter
    moderately bitter
    moderately pleasing taste
    moderately wet
    not bad
    not bitter
    not too strong taste
    pleasing bitter taste
    pleasing bitter
    pleasing brown beer
    pleasing coffee taste taste
    pleasing coffee taste
    pleasing fragrance
    pleasing natural taste
    pleasing pils type
    pleasing sour-cherry taste
    pleasing taste
    pleasing
    raw hoppy taste
        raw
    roasted
    slightly bitter
    slightly sweet
    slightly wet
    slightly wheatbeer taste
        soft
    sour-cherry taste
    strong caramel brown beer
    strong caramel taste
    strong fragrance
    strong taste
    strong
    sweet taste
    sweet
    thick taste
    very bitter
    very mild
    very pleasing
    very sour-cherry taste
    very sweet
    very wet
    wet
            mild
    pleasing
    slightly wet taste

        citrus

*/

    private final String tastename;   // in kilograms
   // private final double value; // in meters
    BeerTastes(String tastename)//, double value)
    {
        this.tastename = tastename;
   //     this.value = value;
    }
    private String typename() { return tastename; }
  //  private double value() { return value; }

    public String getName()
    {
        return this.tastename;
    }
  /*  public double getValue()
    {
        return this.value;
    }*/
}