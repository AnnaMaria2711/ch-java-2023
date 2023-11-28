package Maps;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {


    private Map<String, Medication> checkMeds = new HashMap<>();


    @Override
    public String toString() {
        return "Pharmacy{" +
                "checkMeds=" + checkMeds +
                '}';
    }

    public void addMedication(Medication meds){
        checkMeds.put(meds.getName(),meds);


        }

}
