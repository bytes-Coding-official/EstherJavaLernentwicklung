package aufgabe6;

public abstract class Wohnhaus extends Gebaeude {

    private String eigentuemer;
    private Typ typ;

    public Wohnhaus(String straße, int hausnummer, String eigentuemer, Typ typ) {
        super(straße, hausnummer);
        this.eigentuemer = eigentuemer;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Wohnhaus{" +
                "eigentuemer='" + eigentuemer + '\'' +
                ", typ=" + typ +
                '}';
    }
}
