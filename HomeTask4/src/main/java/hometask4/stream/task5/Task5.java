package hometask4.stream.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;


/**
 * Write a method public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
 * that alternates elements from the stream first and second, stopping
 * when one of them runs out of elements.
 */
public class Task5 {

    public static<T> void main(String[] args) {
        ArrayList<String> one = new ArrayList<String>();
        one.add("a");
        one.add("c");
        one.add("e");
        ArrayList<String> two = new ArrayList<String>();
        two.add("b");
        two.add("d");
        two.add("f");
        two.add("g");
        streamTask4(one, two);

    }

    public static <T> void streamTask4(ArrayList<T> forFirst, ArrayList<T> forSecond) {
        Iterator<T> first = forFirst.iterator();
        Iterator<T> second = forSecond.iterator();
        Stream<T> mainStream = Stream.empty();
        while (first.hasNext()
                && second.hasNext()) {
            mainStream = Stream.concat(mainStream, Stream.of(first.next(),second.next()));
        }
        mainStream.forEach(System.out::println);
    }
}
