package Maps;

import java.util.HashMap;
import java.util.Map;

public class Theory {

    public static void main(String[] args) {
        Map<String, String> favoriteSubject = new HashMap<>();
        favoriteSubject.put("Timeon", "Math");
        favoriteSubject.put("Silvan", "Math");
        favoriteSubject.remove("Silvan");
        System.out.println(favoriteSubject.get("Timeon"));
    }
}
