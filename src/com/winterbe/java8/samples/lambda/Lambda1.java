package com.winterbe.java8.samples.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Benjamin Winterberg
 */
public class Lambda1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        System.out.println("1:"+names);

//        Collections.sort(names, (String a, String b) -> {
//            return b.compareTo(a);
//        });
        Collections.sort(names,(String a,String b)->{return -b.compareTo(a);});
        System.out.println("2:"+names);

        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        System.out.println("3:"+names);

        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("4:"+names);

        names.sort(Collections.reverseOrder());
        System.out.println("5:"+names);

        names.sort(Comparator.naturalOrder());
        System.out.println("6:"+names);

        List<String> names2 = Arrays.asList("peter", null, "anna", "mike", "xenia");
        names2.sort(Comparator.nullsLast(String::compareTo));
        System.out.println("7:"+names2);

        List<String> names3 = null;

        Optional.ofNullable(names3).ifPresent(list -> list.sort(Comparator.naturalOrder()));

        System.out.println("8:"+names3);
    }

}