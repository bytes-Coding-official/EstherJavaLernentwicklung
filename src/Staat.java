
/**
 * Eine Klasse die eine Staat repräsentiert. Enthält die Attribute Name, Hauptstadt, Fläche
 * und Einwohnerzahl. Enthält die Methode zur Ausgabe und zur Aktualisierung der Einwohnerzahl.
 *
 */
public class Staat {

    private String name;
    private String hauptstadt;
    private int flaecheKm2;
    private int einwohner;

    public Staat(String name, String hauptstadt, int flaecheKm2, int einwohner) { //Konstruktor mit allen "Parametern"
        this.name = name; //this wird genutzt wenn: wir den selben namen der variable nehmen wie in der Klasse
        this.hauptstadt = hauptstadt;
        this.flaecheKm2 = flaecheKm2;
        this.einwohner = einwohner;
    }

    public void aktualisierteEinwohnerzahl(int neuerWert) {
        if (neuerWert < 0) {
            System.out.println("Die neue Einwohnerzahl muss positiv sein");
        } else {
            einwohner = neuerWert;
        }
    }

    public double berechneBevoelkerungsdichte() {
        double bevoelkerungsdichte = einwohner / flaecheKm2;
        return bevoelkerungsdichte;
    }


    public void ausgeben() {
        System.out.println("Name: " + name);
        System.out.println("Hauptstadt: " + hauptstadt);
        System.out.println("Fläche: " + flaecheKm2);
        System.out.println("Einwohner: " + einwohner);
        System.out.println("Bevölkerungsdichte: " + berechneBevoelkerungsdichte());
    }


}
