package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Week2Task3 {
    public static void main(String[] args) {
        /*
            Task3
                Реализовать функцию нечеткого поиска
                        fuzzySearch("car", "ca6$$#_rtwheel"); // true
                        fuzzySearch("cwhl", "cartwheel"); // true
                        fuzzySearch("cwhee", "cartwheel"); // true
                        fuzzySearch("cartwheel", "cartwheel"); // true
                        fuzzySearch("cwheeel", "cartwheel"); // false
                        fuzzySearch("lw", "cartwheel"); // false
         */
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }

    public static Boolean fuzzySearch(String pattern, String string) {
        List<Character> list = new ArrayList<>();
        for (int i = 0, j = 0; j < pattern.length() && i < string.length(); i++) {
            if (pattern.charAt(j) != string.charAt(i)) continue;
            list.add(pattern.charAt(j));
            j++;
        }
        return pattern.equals(
                list.stream().map(String::valueOf).collect(Collectors.joining())
        );
    }
}
