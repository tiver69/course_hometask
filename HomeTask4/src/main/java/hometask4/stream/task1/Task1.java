package hometask4.stream.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Svetlana");
        names.add("Roman");
        names.add("Aleksandra");
        names.add("Evgenia");

//        String result = names.stream().filter(i -> names.indexOf(i)%2!=0).collect(Collectors.joining(", "));
        String result = names.stream()
                .filter(i -> names.indexOf(i)%2!=0)
                .map(s -> String.valueOf(names.indexOf(s))+"."+s)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

}
