package com.winterbe.java8.samples.functionInterface;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        System.out.println(predicate.test("foo"));
        predicate.negate().test("foo");     // false
        System.out.println(predicate.negate().test("foo"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        System.out.println(nonNull.test(null));
        System.out.println(nonNull.negate().test(null));
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
