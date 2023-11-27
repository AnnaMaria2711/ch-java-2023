package vererbung;

public class Fahrzeug {
    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    private String hersteller;

    private String modell;

    private int baujahr;

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
    public void printFahrzeug() {
        System.out.println(toString());
    }
}
