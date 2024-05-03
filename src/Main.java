public class Main {
    
    
    public static void main(String[] args) {

        
        
        // (var) DATENTYP VARIABLEN_NAME = new DATENTYP(WERTE_FALLS BENÖTIGT);
        
                
        Staat staat = new Staat("Gurkistan", "Wohnzimmer", 100, 1000000);
        
        staat.aktualisierteEinwohnerzahl(-100);
        staat.aktualisierteEinwohnerzahl(2000000);
        staat.ausgeben();
        
        
    }
}
