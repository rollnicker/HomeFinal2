package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scan.nextInt();
        int[] x = new int[len];
        System.out.print("Введите элементы массива через пробел: ");
        for (int i = 0; i < len; i++) {
            x[i] = scan.nextInt();
        }
        int temp, j;
        for(int i = 0; i < x.length - 1; i++){
            if (x[i] > x[i + 1]) {
                temp = x[i + 1];
                x[i + 1] = x[i];
                j = i;
                while (j > 0 && temp < x[j - 1]) {
                    x[j] = x[j - 1];
                    j--;
                }
                x[j] = temp;
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i  < len; i++){
            System.out.print(" " + x[i]);
        }
    }
}