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
//        Scanner scanner = new Scanner(System.in);
//        int[] mass = new int[10];
//        for (int i = 0; i < mass.length; i++) {
//            System.out.print("Enter number ");
//            int y = scanner.nextInt();
//            mass[i] = y;
//        }
//        for(int i=0; i<mass.length-1; i++) {
//            for (int j=i+1; j<mass.length; j++) {
//                if(mass[i] == mass[j]) {
//                    System.out.println(mass[j]);
//                }
//            }
//        }

        // ------task-5-------//
//        int[] mass = new int[10];
//        for (int i = 0; i < mass.length; i++) {
//            int a = (int) (Math.random()*(100+1)) - 50;
//            mass[i] = a;
//        }
//        System.out.print(Arrays.toString(mass));

        // ------task-6-------//
//        int[] mass = new int[10];
//        for (int i = 0; i < mass.length; i++) {
//            int a = (int) (Math.random()*(40+1)) - 20;
//            mass[i] = a;
//        }
//        for(int i = 0; i<mass.length-1; i++) {
//            for (int j = i+1; j<mass.length; j++) {
//                if(mass[i] > mass[j]) {
//                    int temp = mass[i];
//                    mass[i] = mass[j];
//                    mass[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(mass));

        // ------task-7-------//
//        int[] mass = new int[10];
//        for (int i = 0; i < mass.length; i++) {
//            int a = (int) (Math.random()*(40+1)) - 20;
//            mass[i] = a;
//        }
//        for (int i = mass.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (mass[j] < mass[j+1]) {
//                    int tmp = mass[j];
//                    mass[j] = mass[j+1];
//                    mass[j+1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(mass));

        // ------task-8-------//
//        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(mass));
//        for (int i = 0; i < mass.length / 2; i++) {
//            int tmp = mass[i];
//            mass[i] = mass[mass.length - i - 1];
//            mass[mass.length - i - 1] =  tmp;
//        }
//        System.out.println(Arrays.toString(mass));

        // ------task-9-------//
//        int[] mass_1 = {1, 2, 3, 4, 5};
//        int[] mass_2 = {6, 7, 8, 9, 0};
//        int x1 = 0;
//        int x2 = 0;
//        int x3 = 0;
//        int x4 = 0;
//        int x5 = 0;
//        int[] mass_copy = {x1, x2, x3, x4, x5};
//        for(int i = 0; i < mass_1.length; i ++) {
//            mass_copy[i] = mass_1[i];
//            mass_1[i] = mass_2[i];
//            mass_2[i] = mass_copy[i];
//        }
//        System.out.println(Arrays.toString(mass_1));
//        System.out.println(Arrays.toString(mass_2));

        // ------task-10-------//
        int[] mass_1 = {1, 2, 3, 4, 5};
        int[] mass_2 = {6, 7, 8, 9, 0};
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        int[] mass_copy = {x1, x2, x3, x4, x5};
        for(int i = 0; i < mass_1.length; i ++) {
            mass_copy[i] = mass_1[i];
            mass_1[i] = mass_2[i];
            mass_2[i] = mass_copy[i];
        }
        System.out.println(Arrays.toString(mass_1));
        System.out.println(Arrays.toString(mass_2));

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
