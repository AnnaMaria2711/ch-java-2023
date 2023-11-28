package ListsAndSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student1 = Student.builder()
                .vorname("Waltus")
                .nachname("Waiser")
                .martikelnummer(3749384)
                .build();
        Student student2 = Student.builder()
                .vorname("Binguniam")
                .nachname("Mlemmer")
                .martikelnummer(5720351)
                .build();

        Student student3 = Student.builder()
                .vorname("Sarah")
                .nachname("Zillius")
                .martikelnummer(1946837)
                .build();


        School school1 = new School();
        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);
        System.out.println(school1);

        school1.removeStudent(student2);
        System.out.println(school1);
    }
}