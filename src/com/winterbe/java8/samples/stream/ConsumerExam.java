package com.winterbe.java8.samples.stream;

import java.util.function.Consumer;

/**
 * Consumer是一个消费者，它的accept方法将消费掉输入的参数；如果使用andThen将多个Consumer实例串联
 * 起来，它将会依次进行操作，若其中抛出异常，则后续的consumer不会执行
 */
public class ConsumerExam {
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = p -> System.out.println(p * 10);
        integerConsumer.accept(10);

        Consumer<Integer> consumer1 = p -> System.out.println("consumer1:" + p * 1);
        Consumer<Integer> consumer2 = p -> System.out.println("consumer2:" + p * 2);
        Consumer<Integer> consumer3 = p -> System.out.println("consumer3:" + p * 3);
        consumer1.andThen(consumer2).andThen(consumer3).accept(10);
    }
}
