public class Element {
    private String name;
    private String ideName;
    private String symbol;
    private int charge;

    public Element(String name, String ideName, String symbol, int charge) {
        this.name = name;
        this.ideName = ideName;
        this.symbol = symbol;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public String getIdeName() {
        return ideName;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getCharge() {
        return charge;
    }
}
