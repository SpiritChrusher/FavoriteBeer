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

    public void setQuality(String quality) {
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

    private String quality;

    private String[] acquisition;

    private Double packformat;

 //   private Double price_value;

    public BeerPOJO(String aname, Double alc, String[] ataste, String aorigin, String[] atype, String amanufacturer,
                    String aconsumption, Integer aprice, String aquality, String[] aacquisition, Double apackformat)
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

    public String getQuality() {
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

}