package com.company;
import java.util.Scanner;

public class Main {

    public static class Pyramid {

        public void construction(int size, int[] array) {
            int[][] matrix;
            int count = 0;
            int number = size;
            int n;
            int k = 0;
            while (number != 0) {
                number -= count;
                count++;
            }
            n = count - 1;
            matrix = new int[n][n * 2 - 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    matrix[i][n - i - 1 + j * 2] = array[k];
                    k++;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n * 2 - 1; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static class Sort {
        int[] arr;

        public int[] sorting(int[] array,int size) {
            Pyramid r = new Pyramid();

            int temp = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+ " ");
            }
            System.out.println();
            r.construction(size,array);
            return array;
        }
    }

    public static void main(String[] args) {
        Sort s = new Sort();
        int number,count;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        count = 1;
        number = size;
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        while (number > 0) {
            number -= count;
            count++;
        }

        if (number < 0) {
            System.out.println("ERROR");
        }
        else            {
            System.out.println("Your array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            s.sorting(array, size);
            System.out.println();
        }
    }
}
