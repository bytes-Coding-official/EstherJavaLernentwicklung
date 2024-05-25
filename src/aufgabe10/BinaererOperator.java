package aufgabe10;

public abstract class BinaererOperator extends Term{
    
    protected Term linkerOperand;
    protected Term rechterOperand;


    public BinaererOperator(Term linkerOperand, Term rechterOperand) {
        this.linkerOperand = linkerOperand;
        this.rechterOperand = rechterOperand;
    }

    public Term getLinkerOperand() {
        return linkerOperand;
    }

    public void setLinkerOperand(Term linkerOperand) {
        this.linkerOperand = linkerOperand;
    }

    public Term getRechterOperand() {
        return rechterOperand;
    }

    public void setRechterOperand(Term rechterOperand) {
        this.rechterOperand = rechterOperand;
    }
}
