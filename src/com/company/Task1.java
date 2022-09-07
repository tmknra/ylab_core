package com.company;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        arrayToString(fill(array, 100));

        System.out.println("min = " + min(array));
        System.out.println("max = " + max(array));
        System.out.println("average = " + average(array));
    }

    public static int[][] fill(int[][] array, int randomBound) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(randomBound);
            }
        }
        return array;
    }

    public static int min(int[][] array) {
        int res = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (res > anInt)
                    res = anInt;
            }
        }
        return res;
    }

    public static int max(int[][] array) {
        int res = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (res < anInt)
                    res = anInt;
            }
        }
        return res;
    }

    public static int average(int[][] array) {
        int res = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                res += anInt;
            }
        }
        res = res / (array.length * array[0].length);
        return res;
    }

    public static void arrayToString(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
