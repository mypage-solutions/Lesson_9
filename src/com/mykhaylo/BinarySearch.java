package com.mykhaylo;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        print(binarySearch1(new int[]{1, 8, 10, 15, 20, 30, 50, 51, 52, 53}, 70, 0, 9));
        print(binarySearch2(new int[]{1, 8, 10, 15, 20, 30, 50, 51, 52, 53}, 53));
    }

    /*
    3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
        Входящие параметры: массив и число.
        (считаем что массива который нам передали отсортирован, проверять это не нужно)
     */
    public static boolean binarySearch1(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        return true;
    }

    public static boolean binarySearch2(int[] sortedArray, int key) {
        return Arrays.binarySearch(sortedArray, key) >= 0;
    }

    public static void print(boolean value) {
        System.out.println(value);
    }
}
