package aufgabe6;

public abstract class Gebaeude {

    private final String straße;
    private final int hausnummer;

    
    public Gebaeude(String straße, int hausnummer) {
        this.straße = straße;
        this.hausnummer = hausnummer;
    }

    @Override
    public String toString() {
        return "Gebaeude{" +
                "straße='" + straße + '\'' +
                ", hausnummer=" + hausnummer +
                '}';
    }
}
