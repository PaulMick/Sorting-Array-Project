
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.Arrays;

public class Main {
    public static int[] sort(int[] arr) {
        int large = 0;
        int place = 0;
        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length - i; j ++) {
                if (arr[j] > large) {
                    large = arr[j];
                    place = j;
                }
            }
            arr[place] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = large;
            large = 0;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] ints = {3, 9, 0, 5, 1, 2, 6, 9, 0, 2, 7, 8, 5, 7, 2, 3, 1, 4, 7, 4, 0, 9, 7, 9};
        ints = sort(ints);
        System.out.println(" ");
        System.out.println("Sorted Arrays: " + Arrays.toString(ints));
    }
}
