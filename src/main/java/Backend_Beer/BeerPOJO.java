package Backend_Beer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
//@lombok.Data
public class BeerPOJO {

  //  public  enum Blonde_beers {LAGER("lager",1);  hop_lager("hoplager",5);new_england_ipa("newengland",6); ipa("ipa",7); west_coast_ipa("wcipa",8); double_ipa("dipa",10);};



    
    private  String name;

    private Double alcohol;

    private String[] taste;

    private String origin;

    private String[] type;

    private String manufacturer;

    public void setName(String name) {
        this.name = name;
    }

    public void setAlcohol(Double alcohol) {
        this.alcohol = alcohol;
    }

    public void setTaste(String[] taste) {
        this.taste = taste;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public void setAcquisition(String[] acquisition) {
        this.acquisition = acquisition;
    }

    public void setPackformat(Double packformat) {
        this.packformat = packformat;
    }

    private String consumption;

    private Integer price;

    private Double quality;

    private String[] acquisition;

    private Double packformat;

 //   private Double price_value;

    public BeerPOJO(String aname, Double alc, String[] ataste, String aorigin, String[] atype, String amanufacturer,
                    String aconsumption, Integer aprice, Double aquality, String[] aacquisition, Double apackformat)
    {
        name = aname;
        alcohol = alc;
        taste = ataste;
        origin = aorigin;
        type = atype;
        manufacturer = amanufacturer;
        consumption = aconsumption;
        price = aprice;
        quality = aquality;
        acquisition = aacquisition;
        packformat = apackformat;
    }

    public BeerPOJO(String aname){ name = aname;}

    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", alcohol: " + alcohol +
                ", quality: " + quality + '\'';
    }


    //  return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    //For testing methods
    public BeerPOJO(String aname, String[] atype, Double aqauality, Integer aprice)
    {
        name = aname;
        type = atype;
        quality = aqauality;
        price = aprice;

    }
    

    public String getName() {
        return name;
    }

    public Double getAlcohol() {
        return alcohol;
    }

    public String[] getTaste() {
        return taste;
    }

    public String getOrigin() {
        return origin;
    }

    public String[] getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getConsumption() {
        return consumption;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getQuality() {
        return quality;
    }

    public String[] getAcquisition() {
        return acquisition;
    }

    public Double getPackformat() {
        return packformat;
    }

    private Double calcutale_pricevalue()
    {


        return 1.0;
    }

    public static final String[] izek= {"hoppybitter aftertaste",
            "malty",
            "not strong",
            "soft",
            "alcohol" ,
            "american hoppy" ,
            "bad" ,
            "basic lager taste" ,
            "belgian yeast taste" ,
            "biscuit taste" ,
            "bitter" ,
            "bittersweet" ,
            "brown beer taste" ,
            "caramel" ,
            "characteristicless taste" ,
            "chocolate taste" ,
            "citrus" ,
            "cocoa taste" ,
            "coffee taste" ,
            "corn aftertaste" ,
            "corn taste" ,
            "creamy" ,
            "czech type" ,
            "dark chocolate taste" ,
            "definitive IPA taste" ,
            "drinkable" ,
            "dry czech lager" ,
            "dry" ,
            "easy to drink" ,
            "english ale taste" ,
            "flossy" ,
            "fruity" ,
            "good english ale" ,
            "good lager" ,
            "grits" ,
            "heavy" ,
            "hoppy aftertaste" ,
            "hoppy" ,
            "interesting taste" ,
            "lemony" ,
            "light" ,
            "malty" ,
            "mild roasted bitter taste" ,
            "mild wheatbeer taste" ,
            "mild" ,
            "mildlight beer" ,
            "moderately bitter" ,
            "moderately easy to drink" ,
            "moderately gassy" ,
            "moderately hoppy" ,
            "moderately sweet" ,
            "moderately wheatbeer taste" ,
            "not bitter" ,
            "not characteristic" ,
            "not fruity" ,
            "not gassy" ,
            "not half-brown" ,
            "not really tequila taste" ,
            "not strong taste" ,
            "not too bitter" ,
            "not too strong taste" ,
            "not too strong" ,
            "ordinary lager" ,
            "ordinary taste" ,
            "ordinary wheatbeer taste" ,
            "perfect for work" ,
            "pleasing fruity summer beer" ,
            "pleasing Germany lager" ,
            "pleasing summer beer" ,
            "pleasing taste" ,
            "pleasing wheatbeer" ,
            "pleasing" ,
            "rasberry syrup" ,
            "refreshing" ,
            "roasted aftertaste" ,
            "roasted middletaste" ,
            "roasted taste" ,
            "saazer hop" ,
            "slightly alcohol taste" ,
            "slightly banana aftertaste" ,
            "slightly bitter aftertaste" ,
            "slightly bitter beer" ,
            "slightly bitter red beer taste" ,
            "slightly bitter" ,
            "slightly brownbeer taste" ,
            "slightly caramel taste" ,
            "slightly caramel" ,
            "slightly chocolate taste" ,
            "slightly dunkel weissbier" ,
            "slightly fruity" ,
            "slightly gassy" ,
            "slightly hoppy" ,
            "slightly red beer taste" ,
            "slightly roasted" ,
            "slightly smoky" ,
            "slightly sour" ,
            "slightly stout taste" ,
            "slightly stoutos" ,
            "slightly sweet" ,
            "slightly sweet" ,
            "slightly tea taste" ,
            "slightly went wrong" ,
            "slightly wet" ,
            "slightly wet aftertaste" ,
            "slightly wheatbeer taste" ,
            "smoky" ,
            "soft" ,
            "sour" ,
            "sour-cherry taste brown" ,
            "spicy wheatbeer" ,
            "spicy" ,
            "strange aftertaste" ,
            "strong caramel taste" ,
            "sweet aftertaste" ,
            "sweet" ,
            "tasty" ,
            "tea taste" ,
            "thick imperial stout" ,
            "thick" ,
            "unfiltered taste" ,
            "unique taste" ,
            "unique" ,
            "unpleasant aftertaste" ,
            "unpleasant aftertaste" ,
            "unpleasant bitter aftertaste" ,
            "vegyes taste" ,
            "very bad" ,
            "very bitter" ,
            "very bitter" ,
            "very coffee taste" ,
            "very gassy" ,
            "very heavy" ,
            "very interesting taste" ,
            "very mild" ,
            "very mint" ,
            "very sour aftertaste" ,
            "very strong" ,
            "verywet" ,
            "vomit aftertaste" ,
            "weak taste" ,
            "wheatbeer taste" ,
            "wheatbeer" ,
            "winy" ,
            "yeasty aftertaste" ,
            "yeasty" ,
            "awful" ,
            "balanced taste" ,
            "citrus" ,
            "coffee taste" ,
            "complex" ,
            "corn" ,
            "definitive lager" ,
            "fruity" ,
            "good czech pils taste" ,
            "hoppy" ,
            "interesting taste" ,
            "light lager" ,
            "moderately bitter" ,
            "moderately pleasing" ,
            "pleasing" ,
            "riesling taste" ,
            "simple" ,
            "slight bitter aftertaste" ,
            "slightly bitter" ,
            "slightly brown beer taste" ,
            "slightly sour" ,
            "slightly sweet" ,
            "spicy" ,
            "strong coffee taste" ,
            "strong" ,
            "sweet" ,
            "unpleasant" ,
            "vanilla taste" ,
            "very complex" ,
            "bread yeast taste" ,
            "good red ale taste" ,
            "not too strong" ,
            "slightly bitter" ,
            "sour" ,
            "strong sichuan pepper taste" ,
            "basic czech lager" ,
            "basic german lager" ,
            "basic wheatbeer" ,
            "brown beer taste" ,
            "caramel" ,
            "citrus" ,
            "complex" ,
            "definitive czech beer" ,
            "definitive Germany beer" ,
            "definitive lager" ,
            "definitive wheatbeer taste" ,
            "gassy" ,
            "hoppy" ,
            "lemony" ,
            "mild" ,
            "mildly bitter" ,
            "moderately bitter" ,
            "moderately pleasing taste" ,
            "moderately wet" ,
            "not bad" ,
            "not bitter" ,
            "not too strong taste" ,
            "pleasing bitter taste" ,
            "pleasing bitter" ,
            "pleasing brown beer" ,
            "pleasing coffee taste taste" ,
            "pleasing coffee taste" ,
            "pleasing fragrance" ,
            "pleasing natural taste" ,
            "pleasing pils type" ,
            "pleasing sour-cherry taste" ,
            "pleasing taste" ,
            "pleasing" ,
            "raw hoppy taste" ,
            "raw" ,
            "roasted" ,
            "slightly bitter" ,
            "slightly sweet" ,
            "slightly wet" ,
            "slightly wheatbeer taste" ,
            "soft" ,
            "sour-cherry taste" ,
            "strong caramel brown beer" ,
            "strong caramel taste" ,
            "strong fragrance" ,
            "strong taste" ,
            "strong" ,
            "sweet taste" ,
            "sweet" ,
            "thick taste" ,
            "very bitter" ,
            "very mild" ,
            "very pleasing" ,
            "very sour-cherry taste" ,
            "very sweet" ,
            "very wet" ,
            "wet" ,
            "mild" ,
            "pleasing" ,
            "slightly wet taste" ,
            "citrus"};

}