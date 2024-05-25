package aufgabe10;

public class Variable extends Term{


    @Override
    public double auswerten(double wert) {
        return wert;
    }

    @Override
    public String toString() {
        return "X";
    }
    
    public double getWert() {
        return 0;
    }
}
