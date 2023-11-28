package Maps;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Medication {
    String name;

    int price;

    boolean availability;

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
