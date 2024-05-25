package aufgabe10;

public class Konstante extends Term{
    private final double wert;

    public Konstante(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    @Override
    public double auswerten(double wert) {
        return this.wert;
    }
    

    @Override
    public String toString() {
        return String.valueOf(wert);
    }
    

    @Override
    public Term ableiten() {
        return new Konstante(0);
    }
    
}
