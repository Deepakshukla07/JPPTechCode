package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class JJPTech {

    /*
    1)How to count occurrences of each character in a string in java?
            2)How to perform matrix operations in java?
            3)How to find all pairs of elements in an array whose sum is equal to given number?
            4)How to remove duplicate elements from ArrayList in java?
            5)Write a java program to swap two string variables without using third or temp variable?

     */

    public static void main(String[] args) {
        countOccuranceOfCharacter("deepak");
        swapElement(5, 10);
        ArrayList el = new ArrayList();
        el.add(1);
        el.add(1);
        el.add(2);
        duplicateFromArray(el);

        int a[][] = {{1, 2, 3},
                {4, 5, 6}
        };

        int b[][] = {{1, 2},
                {3, 4},
                {5, 6}};


        matrixMulti(a, b);

    }

    public static void countOccuranceOfCharacter(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                int count = hm.get(str.charAt(i));
                hm.put(str.charAt(i), ++count);
            } else
                hm.put(str.charAt(i), 1);
        }
        System.out.println(hm);
    }

    // pair of sum
    public void twoSum(int[] arr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(sum - arr[i]))
                System.out.println(arr[i] + " " + (sum - arr[i]));
            else
                hs.add(arr[i]);
        }
    }

    public static void swapElement(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("now first num is:" + x);
        System.out.println("second number is:" + y);

    }

    public static void duplicateFromArray(ArrayList<Integer> arrayList) {
        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (Integer ele : arrayList) {
            if (!newArrayList.contains(ele))
                newArrayList.add(ele);

        }
        System.out.println(newArrayList);
    }

    //  2)How to perform matrix operations in java?

    /*
     * Matrix means 2D array.
     * We have many operation in matrix like add,multilication. so
     * Here I am explaining the multiplication steps.
     * 1. Take 2 matrix and check the row length of first array and column size of second array should be same
     *    otherwise return message multiplication is not possible
     * 2. Make an another matrix which length will be [row1][col2]
     * 3. Iterator over it and store the value into new matrix.
     */

    public static void matrixMulti(int[][] a, int[][] b) {
        int c1 = a[0].length;
        int r1 = a.length;
        int c2 = b[0].length;
        int r2 = b.length;
        System.out.println("c1 " + c1);
        System.out.println("r1 " + r1);
        System.out.println("c2 " + c2);
        System.out.println("r2 " + r2);

        if (c1 != r2)
            return;


        int[][] c = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

            }

        }

        // printing result

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }


}
