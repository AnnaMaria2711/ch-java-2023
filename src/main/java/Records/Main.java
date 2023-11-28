package Records;

public class Main {
    public static void main(String[] args) {

        UniversityService a = new UniversityService("a","b");
        a.setPrice(6888);

        Animals animals = new Animals(4,true, "black");

        System.out.println(animals);

        Student x = Student.builder()
                .name("sjfsa")
                .age(54)
                .build();

        System.out.println(x);
        Student y = x.withName("kdfgjflgkjsdm$kglsjfllölsfgklhjsdähld");
        System.out.println(y);
    }
}
