package Backend_Beer;

public enum Beertypes{

    LAGER ("lager", 2),
    HOPLAGER   ("hoplager", 3),
    NEIPA   ("new_england_ipa", 4),
    SIPA    ("season_ipa", 5),
    IPA ("ipa",   6),
    WCIPA  ("west_coast_ipa", 7),
    DIPA  ("double_ipa", 9),
    RSTOUT ("russian imperial stout", 9),
    QUADRUPEL ("quadrupel", 9);

    private final String typename;   // in kilograms
    private final double value; // in meters
    Beertypes(String typename, double value) {
        this.typename = typename;
        this.value = value;
    }
    private String getTypename() { return typename; }
    private double getValue() { return value; }

double sajt(Beertypes a)
{
    return a.getValue() * 10;
}

}
