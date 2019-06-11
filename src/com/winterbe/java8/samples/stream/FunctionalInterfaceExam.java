package com.winterbe.java8.samples.stream;

public class FunctionalInterfaceExam {
    public static void main(String[] args) {
        GreetingService service = p-> System.out.println("Greeting,"+p);
        service.sayMessage("Alex");
    }
}
