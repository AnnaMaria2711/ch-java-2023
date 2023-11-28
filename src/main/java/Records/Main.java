package Records;

public class Main {
    public static void main(String[] args) {

        Animals animals = new Animals(4,true, "black");

        System.out.println(animals);

        Student x = Student.builder()
                .name("sjfsa")
                .age(54)
                .build();

        System.out.println(x);
        Student y = x.withName("kdfgjflgkjsdm$kglsjfllölsfgklhjsdähld");
        System.out.println(y);

        UniversityService us =UniversityService.builder()
                .student1(x)
                .student2(y)
                .price(2347)
                .build();
        System.out.println(us);

        Course english= Course.builder()
                .id(166380083)
                .build();

        Course french= Course.builder()
                .id(1663234444)
                .build();
    }
}




