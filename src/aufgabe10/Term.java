package aufgabe10;

public  abstract class Term {
    
    
    public double auswerten(double wert){
        return wert;
    }
    
    
    public Term ableiten(){
        return new Konstante(0);
    }
    
    //beende wenn |xi+1 - xi| < 10^-14 ist, wirf eine exception wenn nach der 100sten iteration kene konvergenz aufgetreteten ist
    public static double newton(Term term,  double x0){
        
        var x1 = x0;
        var y = 0;
        while (true){
            var x2 = x1;
            x1 = new Minus(
                    term, 
                    new GeteiltDurch(
                     term,
                            term.ableiten()
                    )
            ).auswerten(x0);
            
            x0=x2;
            
            if (Math.abs(x1-x0)< 10e-14) return x1;
    
            y+=1;
            if (y == 100) throw new RuntimeException("Konvergenz");
        }
        
        
    }
}
