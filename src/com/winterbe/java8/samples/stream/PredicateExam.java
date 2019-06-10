package com.winterbe.java8.samples.stream;

import java.util.function.Predicate;

/**
 * Predicate接口的入参是T，结果是Boolean，一个Predicate实例的test方法接受一个参数，
 * 然后输出一个判定结果
 */
public class PredicateExam {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = p-> p>0;
        System.out.println(integerPredicate.test(10));
        System.out.println(integerPredicate.test(-10));
    }
}
