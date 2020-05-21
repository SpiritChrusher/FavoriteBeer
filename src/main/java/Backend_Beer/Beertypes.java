package Backend_Beer;

public enum Beertypes{

    RADLER("radler",1.5),
    LAGER ("lager", 2),
    ALE("ale", 2),
    HOPLAGER   ("hoplager", 3),
    SLAGER("strong lager", 3),
    DLAGER("dark lager", 3),
    PILS("pils", 3),
    MARZEN("marzen", 3.5),
    VLAGER("vienna lager", 3.5),
    NEIPA   ("new_england_ipa", 4.5),
    RALE("red ale", 4.5),
    EPA("english pale ale", 4.5),
    APA("apa", 5),
    BAK("bak", 5),
    WHEAT("wheatbier", 5),
    EIPA("eastern_ipa",5),
    SIPA    ("season_ipa", 5),
    Porter("porter", 5),
    EBOCK("eisbock", 5.5),
    IPA ("ipa",   5.5),
    SHIPA("single hop ipa", 5.5),
    STOUT("stout",5.5),
    DWIESS("dunkel wiessbier", 5.5),
    SOUR("sour ale", 6),
    FALE("fruit ale", 6),
    BALE("belgian strong ale", 6),
    WITBIER("witbier", 6.5),
    BIPA("belgain ipa", 6.5),
    DUBBEL("dubbel", 7),
    WCIPA  ("west_coast_ipa", 7),
    IPORTER("imperial porter", 7.5),
    ISTOUT("imperial stout", 7.5),
    BPORTER("baltic porter",8.0),
    DIPA  ("double_ipa", 8.5),
    Tripel("tripel", 8),
    RSTOUT ("russian imperial stout", 9),
    QUADRUPEL ("quadrupel", 9);

    private final String typename;
    private final double value;
    Beertypes(String typename, double value) {
        this.typename = typename;
        this.value = value;
    }
    private String typename() { return typename; }
    private double value() { return value; }

    public String getName()
    {
        return this.typename;
    }
    public double getValue()
    {
        return this.value;
    }


double sajt(Beertypes a)
{
    return a.value() * 10;
}

}
