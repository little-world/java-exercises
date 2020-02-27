package io.littleworld.streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (int i: integers) {
            if (i > 5)
                System.out.println(i + 5);
        }
    }
}
