package vererbung;

public class inheritance {
    public static void main(String[] args) {
        ElectronicDevice mouse = new ElectronicDevice();
        mouse.setPriceInCent(8790);
        mouse.setName("MX Master 3S");
        mouse.setEnergyConsumptionInWatt(1);

        Screen smartTv= new Screen();
        smartTv.setPriceInCent(99900);
        smartTv.setName("OLED Smart TV");
        smartTv.setEnergyConsumptionInWatt(80);
        smartTv.setResolutionx(3840);
        smartTv.setResolutiony(2160);

        printElectronicDevice(smartTv);

        CanBeHiFi something = smartTv;
        something.setHifi(true);
    }

    public static void printElectronicDevice(ElectronicDevice a){
        System.out.println(a);
    }



}
