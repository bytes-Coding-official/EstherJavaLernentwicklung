package aufgabe7;

import java.util.Random;
import java.util.Scanner;

public class Spiel {
    // Bei Anzeigeproblemen ersetzen Sie die folgenden Strings bitte durch leere
    // Zeichenketten
    static final String fett = "\033[1m";
    static final String blau = "\033[34m";
    static final String grün = "\033[32m";
    static final String rot = "\033[31m";
    static final String lila = "\033[35m";
    static final String normal = "\033[0m";

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        // Spieler erzeugen
        System.out.print("Anzahl der Spieler: ");
        int anzahl = sc.nextInt();
        Spieler[] spieler = new Spieler[anzahl];
        for (int i = 1; i <= anzahl; i++) {
            System.out.print("Spieler " + i
                    + ": Mensch oder Computer (Eingabe m/c): ");
            char typ = sc.next().charAt(0);
            System.out.print("Spielername: ");
            sc.nextLine();       // Rest nach 'm' or 'c' überlesen, mindestens '\n'
            String name = sc.nextLine();
            if (typ == 'm' || typ == 'M')
                spieler[i - 1] = new Mensch(name);
            else
                spieler[i - 1] = new Computer(name);
        }

        // Start des Spiels
        int aktuell = 0;
        Random rnd = new Random();            // intialisiere Zufallszahlengenerator
        while (anzahl > 1) {
            Spieler sp = spieler[aktuell];        // sp auf aktuellen Spieler setzen
            System.out.println(blau + fett + "Spieler " + sp.gibName()
                    + " ist an der Reihe" + normal);
            Einsatz e = sp.einsatz();         // Spieler muss seinen Einsatz abgeben
            int w = rnd.nextInt(6) + 1;                                   // würfeln
            System.out.println(lila + "Würfelergebnis: " + w + normal);
            if (e.gibErgebnis() == 'u' && (w == 1 || w == 3 || w == 5)
                    || e.gibErgebnis() == 'g' && (w == 2 || w == 4 || w == 6)) {
                sp.gewinn(2 * e.gibPunkte());      // gewonnene Punkte hinzuaddieren
                System.out.println(grün + sp.gibName() + " gewinnt "
                        + 2 * e.gibPunkte() + ", neuer Punktestand "
                        + sp.gibPunkte() + normal);
            } else if (e.gibErgebnis() - '0' == w) {
                sp.gewinn(6 * e.gibPunkte());
                System.out.println(grün + sp.gibName() + " gewinnt "
                        + 6 * e.gibPunkte() + ", neuer Punktestand "
                        + sp.gibPunkte() + normal);
            } else
                System.out.println(rot + sp.gibName()
                        + " verliert, neuer Punktestand " + sp.gibPunkte()
                        + normal);
            if (sp.gibPunkte() == 0) {
                System.out.println(rot + fett + sp.gibName()
                        + " muss das Spiel verlassen" + normal);
                anzahl--;
                for (int i = aktuell; i < anzahl; i++)
                    spieler[i] = spieler[i + 1];
                aktuell %= anzahl;
            } else
                aktuell = (aktuell + 1) % anzahl;
        }

        // es ist nur noch ein Spieler übrig, verkünde den Gewinner
        System.out.println(grün + fett + "Gewinner: " + spieler[0].gibName()
                + ", erreichte Punktzahl: " + spieler[0].gibPunkte()
                + normal);
    }
}
