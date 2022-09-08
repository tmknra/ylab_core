package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Week2Task2 {
    public static void main(String[] args) {
        /*
            Task2
                [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */
        System.out.println(Arrays.toString(twoSum(new int[]{3, 4, 2, 7}, 10)));
    }

    public static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer integer = map.get(array[i]);
            if (integer != null)
                return new int[]{array[integer], array[i]};
            map.put(target - array[i], i);
        }
        return array;
    }
}