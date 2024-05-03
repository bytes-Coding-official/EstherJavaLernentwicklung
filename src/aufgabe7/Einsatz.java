package aufgabe7;

public class Einsatz {
    private final int punkte;
    private final char ergebnis; // einer aus g, u, 1, 2, 3, 4, 5, 6

    public Einsatz(int p, char e) {
        punkte = p;
        ergebnis = e;
    }

    public int gibPunkte() {
        return punkte;
    }

    public char gibErgebnis() {
        return ergebnis;
    }
}
