package Backend_Beer;

public enum Beertypes{

    LAGER ("lager", 2),
    ALE("ale", 2),
    HOPLAGER   ("hoplager", 3),
    NEIPA   ("new_england_ipa", 4),
    SIPA    ("season_ipa", 5),
    IPA ("ipa",   5.5),
    WCIPA  ("west_coast_ipa", 7),
    DIPA  ("double_ipa", 9),
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
