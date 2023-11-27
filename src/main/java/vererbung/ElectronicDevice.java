package vererbung;

public class ElectronicDevice {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public int getPriceInCent() {
        return priceInCent;
    }

    public void setPriceInCent(int priceIntCent) {
        this.priceInCent = priceIntCent;
    }

    public int getEnergyConsumptionInWatt() {
        return energyConsumptionInWatt;
    }

    public void setEnergyConsumptionInWatt(int energyConsumptionInWatt) {
        this.energyConsumptionInWatt = energyConsumptionInWatt;
    }

    private int priceInCent;
    private int energyConsumptionInWatt;

}
