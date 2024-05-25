package aufgabe10;

public class Mal extends BinaererOperator {
    public Mal(Term linkerOperand, Term rechterOperand) {
        super(linkerOperand, rechterOperand);
    }

    @Override
    public double auswerten(double wert) {
        return linkerOperand.auswerten(wert) * rechterOperand.auswerten(wert);
    }

    @Override
    public String toString() {
        return "(" + linkerOperand.toString() + " * " + rechterOperand.toString() + ")";
    }


    public Term ableiten() {
        return new Plus(
                new Mal(linkerOperand.ableiten(), rechterOperand),
                new Mal(linkerOperand, rechterOperand.ableiten())
        );
    }
}
