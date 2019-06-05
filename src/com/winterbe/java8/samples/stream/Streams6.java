package com.winterbe.java8.samples.stream;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Benjamin Winterberg
 */
public class Streams6 {

    public static void main(String[] args) throws IOException {
        // some methods of building stream.
        test1();
        test2();
        test3();
        test4();
    }

    private static void test4() {
        Stream
                .of(new BigDecimal("1.2"), new BigDecimal("3.7"))
                .mapToDouble(BigDecimal::doubleValue)
                .average()
                .ifPresent(System.out::println);
        Stream
                .of(new BigInteger("5"),
                        new BigInteger("6"),
                        new BigInteger("7"))
                .mapToLong(BigInteger::longValue)
                .average()
                .ifPresent(System.out::println);
    }

    private static void test3() {
        IntStream
                .range(0, 10)
                .average()
                .ifPresent(System.out::println);
        IntStream
                .range(0, 12)
                .filter(a -> a % 2 != 0)
                .average()
                .ifPresent(System.out::println);
    }

    private static void test2() {
        IntStream
                .builder()
                .add(1)
                .add(3)
                .add(5)
                .add(7)
                .add(11)
                .build()
                .average()
                .ifPresent(System.out::println);
    }

    private static void test1() {
        int[] ints = {1, 3, 5, 7, 11};
        Arrays
                .stream(ints)
                .average()
                .ifPresent(System.out::println);
    }
}
