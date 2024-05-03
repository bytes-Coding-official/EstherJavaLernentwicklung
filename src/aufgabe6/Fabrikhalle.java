package aufgabe6;

public class Fabrikhalle extends Gebaeude {

    private final String firmennamen;

    public Fabrikhalle(String straße, int hausnummer, String firmennamen) {
        super(straße, hausnummer);
        this.firmennamen = firmennamen;
    }

    @Override
    public String toString() {
        return super.toString() + "Fabrikhalle{" +
                "firmennamen='" + firmennamen + '\'' +
                '}';
    }
}
