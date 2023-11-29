package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Filter {

    public static void main(String[] args) {


    List<Integer> numbersList = new ArrayList<>();
    numbersList.add(4348857);
    numbersList.add(2);
    numbersList.add(11);
    numbersList.add(335);
    numbersList.add(27);
    numbersList.add(19060);
        numbersList.add(24384794);

    int finalSum = numbersList.stream()
            .filter(e -> e % 2 == 0)                      //Alle Elemente für die 'e' true ergeben, werden im Stream behalten. "e % 2 == 0" wird überprüft.
            .map(e -> e*2)
            .sorted()
            .reduce(0, (sum , e) -> sum + e);
        System.out.println("Summe: " + finalSum);


       List<Integer> calculatedNumbers =numbersList.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e*2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(calculatedNumbers);

}
}

