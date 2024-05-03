package aufgabe6;

public abstract class Gebaeude {

    private String straße;
    private int hausnummer;

    
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
