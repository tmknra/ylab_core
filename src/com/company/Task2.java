package com.company;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        int min = min(array);
        int max = max(array);

        arrayToString(array);
        sort(array, 0, array.length-1);
        arrayToString(array);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

    public static int[] sort(int[] array, int leftBorder, int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        int target = array[(left + right) / 2];
        do {
            while (array[left] < target)
                left++;
            while (array[right] > target)
                right--;
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            left++;
            right--;
        } while (left <= right);
        if (left < rightBorder)
            sort(array, left, rightBorder);
        if (right > leftBorder)
            sort(array, leftBorder, right);
        return array;
    }

    public static int min(int[] array) {
        int res = array[0];
        for (int j : array) {
            if (res > j)
                res = j;
        }
        return res;
    }

    public static int max(int[] array) {
        int res = array[0];
        for (int j : array) {
            if (res < j)
                res = j;
        }
        return res;
    }

    public static void arrayToString(int[] array) {
        for (int anInt : array)
            System.out.print(anInt + " ");
        System.out.println();
    }

}
