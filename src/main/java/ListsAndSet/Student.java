package ListsAndSet;

import lombok.Builder;
import lombok.With;

@Builder
@With

public class Student {
    String vorname;
    String nachname;
    int martikelnummer;

    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", martikelnummer=" + martikelnummer +
                '}';
    }
}
