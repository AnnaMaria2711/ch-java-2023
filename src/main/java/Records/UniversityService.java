package Records;

import lombok.*;


@Getter
@Setter
@Builder
public class UniversityService {

    @With
    private final Student student1;
    private final Student student2;
    private int price;


}
