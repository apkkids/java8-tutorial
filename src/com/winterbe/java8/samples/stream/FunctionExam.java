package com.winterbe.java8.samples.stream;

import java.util.function.Function;

/**
 * Function<T,R>,T表示输入参数类型，R表示输出结果类型，它的apply方法将输入参数转换为
 * 一个输出的结果。
 */
public class FunctionExam {
    public static void main(String[] args) {
        Function<Integer, String> function = t -> "string:" + String.valueOf(t);
        String str = function.apply(10);
        System.out.println(str);
    }
}
