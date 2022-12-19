package com.robocode.marafon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ------task-1------//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("x = ");
//        int x = scanner.nextInt();
//        System.out.print("y = ");
//        int y = scanner.nextInt();
//        plus(x, y);
//        minus(x, y);
//        multiplication(x, y);
//        division(x, y);

        // ------task-2-------//
//        Scanner scanner = new Scanner(System.in);
//        int[] mass = new int[10];
//        for (int i = 0; i < mass.length; i++) {
//            System.out.print("Enter number ");
//            int y = scanner.nextInt();
//            mass[i] = y;
//        }
//        System.out.print(Arrays.toString(mass));

        // ------task-3-------//
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            System.out.print("Enter number ");
            int y = scanner.nextInt();
            mass[i] = y;
        }
        System.out.print(Arrays.toString(mass));

    }

    public static void plus(int x, int y) {
        System.out.println(x + y);
    }
    public static void minus(int x, int y) {
        System.out.println(x - y);
    }
    public static void multiplication(int x, int y) {
        System.out.println(x * y);
    }
    public static void division(int x, int y) {
        System.out.println(x / y);
    }


}
