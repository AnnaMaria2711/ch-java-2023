
package Records;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
public class Student {
    @With
    String name;
    int age;

}
