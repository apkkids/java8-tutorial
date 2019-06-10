package com.winterbe.java8.samples.stream;

import java.util.function.BiConsumer;

/**
 * BiConsumer是Consumer的二元参数版本，它的accept方法消耗两个参数。
 */
public class BiConsumerExam {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biConsumer = (p, s) -> System.out.println("first:" + p + ",second:" + s);
        biConsumer.accept(10, "Alex");

        BiConsumer<Integer, String> biConsumer1 = (p, s) -> System.out.println("first:" + p * 10 + ",second:" + s);
        BiConsumer<Integer, String> biConsumer2 = (p, s) -> System.out.println("first:" + p * 20 + ",second:" + s);
        BiConsumer<Integer, String> biConsumer3 = (p, s) -> System.out.println("first:" + p * 30 + ",second:" + s);

        biConsumer1.andThen(biConsumer2).andThen(biConsumer3).accept(10, "Wang");
    }
}
