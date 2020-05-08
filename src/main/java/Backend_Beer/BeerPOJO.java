package Backend_Beer;

import lombok.*;

@lombok.Data
public class BeerPOJO {

    private String name;

    private Double alcohol;

    private String[] taste;

    private String origin;

    private String[] type;

    private String manufacturer;

    private String consumption;

    private Integer price;

    private String quality;

    private String[] acquisition;

    private Double packformat;

    private Double price_value;

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

    private Double calcutale_pricevalue()
    {
        return 1.0;
    }

}