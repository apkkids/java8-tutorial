package com.winterbe.java8.samples.functionInterface;

import java.util.Optional;

/**
 * @Description Optional是为了防止null
 * @Author alex
 * @Date 2019/6/1 21:26
 */
public class Optionals {
    public static void main(String[] args) {
        Integer i1 = null;
        Integer i2 = new Integer(10);
        Optional<Integer> optional1 = Optional.ofNullable(i1);
        Optional<Integer> optional2 = Optional.of(i2);
        System.out.println(optional1.isPresent());//判断值是否存在
        optional2.ifPresent(i -> System.out.println(i * 2));//如果值存在则执行lambda函数
        System.out.println(optional1.orElse(0));//为null则返回默认值
        System.out.println(optional2.get());//获取值
    }
}
