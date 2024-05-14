package com.algorithms.dynamic.fib;

import java.util.Scanner;


public class Fibonacci {

    static int count = 0;
    //    public static int fibr(int n){
//        ++count;
//        if(n==0 || n==1) return n;
//        else return fibr(n-1) + fibr(n-2);
//    }
    static Integer memo[] = new Integer[100];

    public static int fib(int n) {
        ++count;
        if (memo[n] != null) return memo[n];
        if (n == 0 || n == 1) return n;
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input value:");
        int n = sc.nextInt();
       // Integer[] memo = new Integer[n+1];
        System.out.println(fib(n));
        System.out.println("Calls:"+ count);

    }
}
