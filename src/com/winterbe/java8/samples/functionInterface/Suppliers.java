package com.winterbe.java8.samples.functionInterface;

import com.winterbe.java8.samples.lambda.Person;

import java.util.function.Supplier;

/**
 * @Description Suppliers produce a result of a given generic type. Unlike Functions, Suppliers don't accept arguments.
 * @Author alex
 * @Date 2019/5/25 17:57
 */
public class Suppliers {
    public static void main(String[] args) {
        Supplier<Person>  personSupplier = Person::new;
        Person person = personSupplier.get();
        System.out.println(person);

        Supplier<String> stringSupplier = String::new;
        String str = stringSupplier.get();
        System.out.println(str);
    }
}
