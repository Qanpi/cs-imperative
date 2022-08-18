package com.company;

import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        hw1();
//        hw2(3,3);
        hw3();
//        hw4(18);
//        hw5(100, 30);
//        hw6(7);
//        hw7();
//        hw8(3, 6);
//        hw9(100);
//        hw10(3, 15);
        // THE COMMENTED OUT FUNCTIONS (THOSE THAT TAKE INPUTS) ARE TESTED IN THE JUNIT TEST FILE
        System.out.println("The rest of the functions (those that take inputs) are tested using the JUnit framework in the test/ directory.");
    }

    static int hw10(int a, int b) {
        // could also be done with recursion, but probably less efficient
        int ans = 0;

        while (ans == 0) {
            if (a < b) { //swapping without using Math.min/max
                int temp = a;
                a = b;
                b = temp;
            }

            int r = a % b;
            if (r == 0) ans = b;
            else {
                a = b;
                b = r;
            }
        }

        return ans;
    }

    static int hw9(int t) {
        int prev = 120000; //the n of bacteria at t=0
        int maxDecrease = 0;
        int ans = 0;
        for(int i=1; i<t; i++) {
            int current = i * (i - 20) * (i - 100) + 120000;
            if (prev - current > maxDecrease) {
                maxDecrease = prev - current;
                ans = i;
            }
            prev = current;
        }
        return ans;
    }

    static int hw82(int a, int b) {
        int res = 1;
        for(int i=0; i<a; i++) {
            res *= b; // not good practice, but efficient
        }
        return res;
    }

    static int hw81(int a) {
        int result = 1;
        for (int i=0; i<a; i++) {
            result *= 3;
        }
        return result;
    }

    static int hw7() {
        int n = 0;
        while (true) {
            if ((n*n*n+91) % 47 == 0) break;
            n++;
        }
        return n;
    }

    static int hw6(int w) {
        int price;
        if (w <= 2) {
            price = 3;
        } else if (w <= 5) {
            price = 3 + 2*(w-2);
        } else {
            price = 9 + 3 * (w - 5);
        }
        return price;
    }

    static int hw52(int a, int b) {
        int val2 = 0;
        if (a >= 100) {
            if (b <= 50) val2 = 1;
        } else if (b >= 100) {
            if (a <= 50) val2 = 1;
        }
        return val2;
    }

    static int hw51(int a, int b) {
        // no logical connectives or return statements
        int val1 = 0;
        if (a >= 100) {
            if (b <= 50) val1 = 1;
        }
        return val1;
    }

    static String hw4(int T) {
        String action = "";
        if (T < 17) {
            action = "hit";
        } else if (T<=21) {
            action = "stay";
        } else {
            action = "bust";
        }
        return action;
    }

    static void hw3(){
        for(int i=10; i<37; i++) {
            System.out.println(i);
        }
        for (int i=998; i>=900; i-=2){
            System.out.println(i);
        }
        for (int i=0; i<20; i++){
            int isNeg = i % 2 == 0 ? 1 : -1;
            System.out.println(i*isNeg);
        }
        for (int i=0; i<60; i++){
            if (i%3==0)
                System.out.println(9);
            else
                System.out.println(7);
        }
    }

    static int hw2(int a, int b){
        int res;

        if (a==b) res = (a+b)*(a+b);
        else res = a+b;

        return res;
    }

    static void hw1(){
        // not the prettiest function, but oh well
        System.out.println("Fundamental computer operations:");
        System.out.println("1. Add two values");
        System.out.println("2. Store a value");
        System.out.println();
        System.out.println("Compound computer operations:");
        System.out.println("1. Find factorial of x");
        System.out.println("2. Call an API endpoint");
        System.out.println();
        System.out.println("Three essential features:");
        System.out.println("1. Consistent syntax");
        System.out.println("2. Compiler/interpreter, i.e. a way to execute the code");
        System.out.println("3. A starting point (e.g. the main function in Java)");
        System.out.println();
        System.out.println("Compiler operations");
        System.out.println("1. Break the raw text into tokens and phrases");
        System.out.println("2. Check semantics and make sure the code is runnable");
        System.out.println("3. Convert the code into machine language and run");
        System.out.println("4. Optionally optimize and link with other files of code");
        System.out.println();
        System.out.println("One reason to use constants is to prevent the accidental modification of values.");
    }
}
