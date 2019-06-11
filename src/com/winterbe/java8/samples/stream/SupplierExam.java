package com.winterbe.java8.samples.stream;

import java.util.function.Supplier;

/**
 * Supplier可以被赋值一个lambda函数，然后调用get方法，一般这个get方法会返回一个新的对象，所以本接口被称为“供应商”。
 */
public class SupplierExam {
    static class Person {
        String name;

        Person() {
            System.out.println("new a instance without name, object=" + this);
        }

        Person(String name) {
            this.name = name;
            System.out.println("new a instance with name:" + name + ", object=" + this);
        }
    }

    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        System.out.println(personSupplier.getClass());
        Person a = personSupplier.get();
        personSupplier.get();
        new Person("Alex");
        new Person("Wang");
    }
}
