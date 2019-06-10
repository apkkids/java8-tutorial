package com.winterbe.java8.samples.stream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * BinaryOperator是BiFunction的子接口，接受两个类型一致的操作数，返回相同类型的结果
 */
public class BinaryOperatorExam {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(4, 5));

        //BiFunction
        BiFunction<Integer, Double, String> biFunction = (a, b) -> String.format("first=%d,second=%f", a, b);
        System.out.println(biFunction.apply(10, 3.14));
    }
}
