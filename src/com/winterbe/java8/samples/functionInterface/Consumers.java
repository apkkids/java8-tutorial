package com.winterbe.java8.samples.functionInterface;

import com.winterbe.java8.samples.lambda.Person;

import java.util.function.Consumer;

/**
 * @Description Consumers represent operations to be performed on a single input argument.
 * @Author alex
 * @Date 2019/5/25 18:01
 */
public class Consumers {
    public static void main(String[] args) {
        Consumer<Person> greeter = (person -> System.out.println("Hello," + person.firstName));
        greeter.accept(new Person("Alex","Wang"));
    }
}
