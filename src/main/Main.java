package main;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 7};
        findElement(arr, 2);
        duplicates(arr);
    }

    public static void findElement(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void duplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("duplicate values are:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
