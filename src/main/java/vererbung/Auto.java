package vererbung;

public class Auto extends Fahrzeug {
    public int getAnzahlTüren() {
        return anzahlTüren;
    }

    public void setAnzahlTüren(int anzahlTüren) {
        this.anzahlTüren = anzahlTüren;
    }

    public boolean isSitzwärmer() {
        return sitzwärmer;
    }

    public void setSitzwärmer(boolean sitzwärmer) {
        this.sitzwärmer = sitzwärmer;
    }

    public int getAnzahlScheiben() {
        return anzahlScheiben;
    }

    public void setAnzahlScheiben(int anzahlScheiben) {
        this.anzahlScheiben = anzahlScheiben;
    }

    private int anzahlTüren;
    private boolean sitzwärmer;

    private int anzahlScheiben;

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "Anzahl Türen = '" + anzahlTüren + '\'' +
                ", Sitzwärmer? = '" + sitzwärmer + '\'' +
                ", Anzahl Scheiben = " + anzahlScheiben +
                '}';
    }
    public void printAuto() {
        System.out.println(toString());
    }
}
