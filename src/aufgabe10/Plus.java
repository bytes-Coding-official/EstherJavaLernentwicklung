package aufgabe10;

public class Plus extends BinaererOperator {
    public Plus(Term linkerOperand, Term rechterOperand) {
        super(linkerOperand, rechterOperand);
    }

    @Override
    public double auswerten(double wert) {
        return linkerOperand.auswerten(wert) + rechterOperand.auswerten(wert);
    }

    @Override
    public String toString() {
        return "(" + linkerOperand.toString() + " + " + rechterOperand.toString() + ")";
    }
    
    public Term ableiten(){
        return new Plus(linkerOperand.ableiten(), rechterOperand.ableiten());
    }
}
