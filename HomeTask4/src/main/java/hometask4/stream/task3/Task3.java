package hometask4.stream.task3;

import java.util.Arrays;

/**
 * Given  and collection = Arrays.asList ("1, 2, 0", "4, 5")
 * From the collection get all the numbers listed, separated by commas from all the elements
 */
public class Task3 {

    public static void main(String[] args) {
        Arrays.asList("1,2,3", "4,5")
                .forEach(s ->
                        Arrays.stream(s.split(",")).forEach(System.out::println));
    }
}
