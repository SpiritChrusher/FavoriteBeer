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

    public BeerPOJO(){}

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

    public final String[] izek= {"hoppybitter aftertaste\n" +
            "malty\n" +
            "not strong\n" +
            "soft\n" +
            "alcohol\n" +
            "american hoppy\n" +
            "bad\n" +
            "basic lager taste\n" +
            "belgian yeast taste\n" +
            "biscuit taste\n" +
            "bitter\n" +
            "bittersweet\n" +
            "brown beer taste\n" +
            "caramel\n" +
            "characteristicless taste\n" +
            "chocolate taste\n" +
            "citrus\n" +
            "cocoa taste\n" +
            "coffee taste\n" +
            "corn aftertaste\n" +
            "corn taste\n" +
            "creamy\n" +
            "czech type\n" +
            "dark chocolate taste\n" +
            "definitive IPA taste\n" +
            "drinkable\n" +
            "dry czech lager\n" +
            "dry\n" +
            "easy to drink\n" +
            "english ale taste\n" +
            "flossy\n" +
            "fruity\n" +
            "good english ale\n" +
            "good lager\n" +
            "grits\n" +
            "heavy\n" +
            "hoppy aftertaste\n" +
            "hoppy\n" +
            "interesting taste\n" +
            "kicst alcohol\n" +
            "lemony\n" +
            "light\n" +
            "malty\n" +
            "mild roasted bitter taste\n" +
            "mild wheatbeer taste\n" +
            "mild\n" +
            "mildlight beer\n" +
            "moderately bitter\n" +
            "moderately bitter\n" +
            "moderately easy to drink\n" +
            "moderately gassy\n" +
            "moderately hoppy\n" +
            "moderately sweet\n" +
            "moderately wheatbeer taste\n" +
            "not bitter\n" +
            "not characteristic\n" +
            "not fruity\n" +
            "not gassy\n" +
            "not half-brown\n" +
            "not really tequila taste\n" +
            "not strong taste\n" +
            "not too strong\n" +
            "not too bitter\n" +
            "not too strong taste\n" +
            "not too strong\n" +
            "ordinary lager\n" +
            "ordinary taste\n" +
            "ordinary wheatbeer taste\n" +
            "perfect for work\n" +
            "pleasing fruity summer beer\n" +
            "pleasing Germany lager\n" +
            "pleasing summer beer\n" +
            "pleasing taste\n" +
            "pleasing taste\n" +
            "pleasing wheatbeer\n" +
            "pleasing\n" +
            "pleasing\n" +
            "rasberry syrup\n" +
            "refreshing\n" +
            "roasted aftertaste\n" +
            "roasted middletaste\n" +
            "roasted taste\n" +
            "saazer hop\n" +
            "slightly alcohol taste\n" +
            "slightly banana aftertaste\n" +
            "slightly bitter aftertaste\n" +
            "slightly bitter beer\n" +
            "slightly bitter red beer taste\n" +
            "slightly bitter\n" +
            "slightly bitter\n" +
            "slightly brownbeer taste\n" +
            "slightly caramel taste\n" +
            "slightly caramel\n" +
            "slightly chocolate taste\n" +
            "slightly dunkel weissbier\n" +
            "slightly fruity\n" +
            "slightly gassy\n" +
            "slightly hoppy\n" +
            "slightly red beer taste\n" +
            "slightly roasted\n" +
            "slightly smoky\n" +
            "slightly smoky\n" +
            "slightly sour\n" +
            "slightly stout taste\n" +
            "slightly stoutos\n" +
            "slightly sweet\n" +
            "slightly sweet\n" +
            "slightly tea taste\n" +
            "slightly went wrong\n" +
            "slightly wet\n" +
            "slightly wet\n" +
            "slightly wet aftertaste\n" +
            "slightly wheatbeer taste\n" +
            "smoky\n" +
            "soft\n" +
            "sour\n" +
            "sour-cherry taste brown\n" +
            "spicy wheatbeer\n" +
            "spicy\n" +
            "strange aftertaste\n" +
            "strong caramel taste\n" +
            "sweet aftertaste\n" +
            "sweet\n" +
            "tasty\n" +
            "tea taste\n" +
            "thick imperial stout\n" +
            "thick\n" +
            "unfiltered taste\n" +
            "unique taste\n" +
            "unique\n" +
            "unpleasant aftertaste\n" +
            "unpleasant aftertaste\n" +
            "unpleasant bitter aftertaste\n" +
            "vegyes taste\n" +
            "very bad\n" +
            "very bitter\n" +
            "very bitter\n" +
            "very coffee taste\n" +
            "very gassy\n" +
            "very heavy\n" +
            "very interesting taste\n" +
            "very mild\n" +
            "very mint\n" +
            "very sour aftertaste\n" +
            "very strong\n" +
            "verywet\n" +
            "vomit aftertaste\n" +
            "weak taste\n" +
            "wheatbeer taste\n" +
            "wheatbeer\n" +
            "winy\n" +
            "yeasty aftertaste\n" +
            "yeasty\n" +
            "awful\n" +
            "balanced taste\n" +
            "citrus\n" +
            "coffee taste\n" +
            "complex\n" +
            "corn\n" +
            "definitive lager\n" +
            "easy to drink\n" +
            "fruity\n" +
            "good czech pils taste\n" +
            "hoppy\n" +
            "interesting taste\n" +
            "light lager\n" +
            "moderately bitter\n" +
            "moderately pleasing\n" +
            "pleasing\n" +
            "riesling taste\n" +
            "simple\n" +
            "slight bitter aftertaste\n" +
            "slightly bitter\n" +
            "slightly brown beer taste\n" +
            "slightly sour\n" +
            "slightly sweet\n" +
            "spicy\n" +
            "strong coffee taste\n" +
            "strong\n" +
            "sweet\n" +
            "unpleasant\n" +
            "vanilla taste\n" +
            "very complex\n" +
            "bread yeast taste\n" +
            "good red ale taste\n" +
            "not too strong\n" +
            "slightly bitter\n" +
            "sour\n" +
            "strong sichuan pepper taste\n" +
            "basic czech lager\n" +
            "basic german lager\n" +
            "basic wheatbeer\n" +
            "brown beer taste\n" +
            "caramel\n" +
            "citrus\n" +
            "complex\n" +
            "definitive czech beer\n" +
            "definitive Germany beer\n" +
            "definitive lager\n" +
            "definitive wheatbeer taste\n" +
            "easy to drink\n" +
            "gassy\n" +
            "hoppy\n" +
            "lemony\n" +
            "mild\n" +
            "mildly bitter\n" +
            "moderately bitter\n" +
            "moderately pleasing taste\n" +
            "moderately wet\n" +
            "not bad\n" +
            "not bitter\n" +
            "not too strong taste\n" +
            "pleasing bitter taste\n" +
            "pleasing bitter\n" +
            "pleasing brown beer\n" +
            "pleasing coffee taste taste\n" +
            "pleasing coffee taste\n" +
            "pleasing fragrance\n" +
            "pleasing natural taste\n" +
            "pleasing pils type\n" +
            "pleasing sour-cherry taste\n" +
            "pleasing taste\n" +
            "pleasing\n" +
            "raw hoppy taste\n" +
            "raw\n" +
            "roasted\n" +
            "slightly bitter\n" +
            "slightly sweet\n" +
            "slightly wet\n" +
            "slightly wheatbeer taste\n" +
            "soft\n" +
            "sour-cherry taste\n" +
            "strong caramel brown beer\n" +
            "strong caramel taste\n" +
            "strong fragrance\n" +
            "strong taste\n" +
            "strong\n" +
            "sweet taste\n" +
            "sweet\n" +
            "thick taste\n" +
            "very bitter\n" +
            "very mild\n" +
            "very pleasing\n" +
            "very sour-cherry taste\n" +
            "very sweet\n" +
            "very wet\n" +
            "wet\n" +
            "mild\n" +
            "pleasing\n" +
            "slightly wet taste\n" +
            "citrus\n"};

}