package ListsAndSet;

import java.util.*;

public class Theory {

    public static void main(String[] args) {


        List<String> petList = new ArrayList<>();
        petList.add("Anna");
        petList.add("Yoda");
        petList.add("Noodles");
        System.out.println(petList);
        petList.remove("Noodles");


        String pet = petList.get(0);
        System.out.println(pet);
        petList = new LinkedList<>();

        Set<String> petSet = new HashSet<>();
        petSet.add("Spike");
        petSet.add("Anna");
        petSet.remove("Anna");
        petSet.contains("Spike");
        System.out.println(petSet);

    }
}
