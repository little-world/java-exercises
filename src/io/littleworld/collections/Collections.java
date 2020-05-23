package io.littleworld.collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        Arrays.asList();

        for (int a : ints) {
            System.out.println(a);
        }

        Map<Integer, String> pairs = new HashMap<>();
        pairs.put(1, "first");
        pairs.put(2, "second");
        pairs.put(3, "third");

        System.out.println(pairs.get(2));


        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        for (int a : set) {
            System.out.println(a);
        }

    }
}
