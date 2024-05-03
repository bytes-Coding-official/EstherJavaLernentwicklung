package aufgabe6;

public class TestKlasse {

    public static void main(String[] args) {


        /* Wird nicht gehen-> Weil abstrakt!       Wohnhaus wohnhaus = new Wohnhaus() ;*/

        Mietshaus mietshaus = new Mietshaus("Hauptstraße", 1, "Hans", Typ.DENKMAL_GESCHUESTES_GEBAUEDE, 5);

        System.out.println(mietshaus);

        Fabrikhalle halle = new Fabrikhalle("Hauptstraße", 1, "Hansga mbH Co. KG.");

        System.out.println(halle);

        Eigenheim eigenheim = new Eigenheim("Hauptstraße", 1, "Hans", Typ.NEUBAU);

        System.out.println(eigenheim);
    }
}
