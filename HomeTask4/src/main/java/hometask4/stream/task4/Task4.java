package hometask4.stream.task4;

import java.util.stream.Stream;

import static java.lang.Math.pow;

/**
 * Using Stream.iterate, make an infinite stream of random numbers — not by calling Math.random
 * but by directly implementing a linear congruential generator.
 * In such a generator, you start with x[0] = seed and then produce x[n + 1] = 1 (a x[n] + c) % m,
 * for appropriate values of a, c, and m.
 * You should implement a method with parameters a, c, m, and seed that yields a Stream<Long>.
 * Try out a = 25214903917, c = 11, and m = 2^48.
 */
public class Task4 {

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) pow(2, 48);
        long seed = 17L;

        Stream.iterate(seed, newSeed -> (a * newSeed + c) % m)
                .limit(20)
                .forEach(System.out::println);

    }
}
