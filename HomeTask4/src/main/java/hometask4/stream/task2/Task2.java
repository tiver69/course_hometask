package hometask4.stream.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Svetlana");
        names.add("Roman");
        names.add("Aleksandra");
        names.add("Evgenia");

        names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
