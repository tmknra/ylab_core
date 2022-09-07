package com.company;

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
        return string.replaceAll("[^" + pattern + "]", "").contains(pattern);
    }
}
