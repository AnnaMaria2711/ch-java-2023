package vererbung;

public class InheritanceFahrzeuge {
    public static void main(String[] args) {

        Fahrzeug auto = new Auto();
        auto.setHersteller("Ford");
        auto.setModell("F-150");
        auto.setBaujahr(2023);


        System.out.print(auto);

        Auto auto1 = new Auto();
        auto1.setAnzahlTüren(4);
        auto1.setSitzwärmer(true);
        auto1.setAnzahlScheiben(6);

        System.out.println(auto1);
    }


}