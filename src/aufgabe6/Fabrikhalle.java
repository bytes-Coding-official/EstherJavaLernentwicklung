package aufgabe6;

public class Fabrikhalle extends Gebaeude {
    
    private String firmennamen;

    public Fabrikhalle(String straße, int hausnummer, String firmennamen) {
        super(straße, hausnummer);
        this.firmennamen = firmennamen;
    }

    @Override
    public String toString() {
        return "Fabrikhalle{" +
                "firmennamen='" + firmennamen + '\'' +
                '}';
    }
}
