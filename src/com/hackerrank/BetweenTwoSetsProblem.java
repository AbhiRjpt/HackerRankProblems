package com.hackerrank;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSetsProblem {
    public static int gcd(int a, int b) {
        System.out.println("a: "+a +" b: "+b);
        while (a > 0 && b > 0) {

            if (a >= b) {
                a = a % b;
                System.out.println("In if a: "+a);
            }
            else {
                b = b % a;
                System.out.println("In if b: "+b);
            }
        }

        System.out.println("a: "+a +" b: "+b);
        return a + b;
    }

    public static int lcm(int a, int b) {
        System.out.println("LCM a : " +a+" b:"+b);
        return (a / gcd(a, b)) * b;
    }

    public static int getTotalX(int[] a, int[] b) {

        int multiple = 0;
        for(int i : b) {
            System.out.println("multiple: "+multiple);
            System.out.println("i: "+i);
            multiple = gcd(multiple, i);
            System.out.println("multiple: "+multiple);
        }
//        System.err.println("Multiple: " + multiple);
        System.out.println("MULTIPLE IS : "+multiple);

        int factor = 1;
        System.out.println("-----Factor----");
        for(int i : a) {
            System.out.println("i: "+i);
            factor = lcm(factor, i);
            System.out.println("factor: "+factor);
            if (factor > multiple) {
                return 0;
            }
        }

        System.out.println("FACTOR IS: "+factor);

        if (multiple % factor != 0) {
            return 0;
        }
//        System.err.println("Factor: " + factor);

        int value = multiple / factor;

        System.out.println("VALUE: "+value);

        int max = Math.max(factor, value);
        System.out.println("max: "+max);
        int totalX = 1;

        for (int i = factor; i < multiple; i++) {
            System.out.println("multiple % i: "+(multiple % i));
            System.out.println("i % factor: "+(i % factor));
            if (multiple % i == 0 && i % factor == 0) {
                totalX++;
                System.out.println("totalX: "+totalX);
            }
        }

        System.out.println("totalX: "+totalX);
        return totalX;

    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int m = scan.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = scan.nextInt();
//        }
//        int[] b = new int[m];
//        for (int i = 0; i < m; i++) {
//            b[i] = scan.nextInt();
//        }
//        scan.close();

        int[] a = {2,4};
        int[] b = {16,32,96};

        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
