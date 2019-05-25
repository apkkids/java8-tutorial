package com.winterbe.java8.samples.functionInterface;

import java.util.function.Function;

/**
 * @Description Functions accept one argument and produce a result. Default methods can be used to chain multiple functions together (compose, andThen).
 * @Author alex
 * @Date 2019/5/25 17:49
 */
public class Functions {
    public static void main(String[] args) {
        Function<String,Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        Integer integer = toInteger.apply("123");
        System.out.println(integer);
        String backStr = backToString.apply("123");
        System.out.println(backStr);
    }
}
