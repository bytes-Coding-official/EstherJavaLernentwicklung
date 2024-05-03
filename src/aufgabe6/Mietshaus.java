package aufgabe6;

public class Mietshaus extends Wohnhaus{


    private final int anzahlWohnungen;

    public Mietshaus(String straße, int hausnummer, String eigentuemer, Typ typ, int anzahlWohnungen) {
        super(straße, hausnummer, eigentuemer, typ);
        this.anzahlWohnungen = anzahlWohnungen;
    }

    @Override
    public String toString() {
        return super.toString() + "Mietshaus{" +
                "anzahlWohnungen=" + anzahlWohnungen +
                '}';
    }
}
