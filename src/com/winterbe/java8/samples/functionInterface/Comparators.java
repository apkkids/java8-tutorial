package com.winterbe.java8.samples.functionInterface;

import com.winterbe.java8.samples.lambda.Person;

import java.util.Comparator;

/**
 * @Description TODO
 * @Author alex
 * @Date 2019/5/25 18:05
 */
public class Comparators {
    public static void main(String[] args) {
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Alex", "Wang");
        System.out.println(comparator.compare(person1, person2));
        System.out.println(comparator.reversed().compare(person1,person2));
    }
}
