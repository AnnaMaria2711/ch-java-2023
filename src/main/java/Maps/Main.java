package Maps;

public class Main {

    public static void main(String[] args) {

        Medication aspirin = new Medication();
        aspirin.setName("aspirin");
        aspirin.setAvailability(true);
        aspirin.setPrice(23);

        Pharmacy leuenberg = new Pharmacy();
        leuenberg.addMedication(aspirin);
        System.out.println(leuenberg);
    }

}
