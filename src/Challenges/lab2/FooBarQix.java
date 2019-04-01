package Challenges.lab2;

import java.util.Scanner;

public class FooBarQix {
    public static void compute(int n) {
        int i = 1, j, k = 0;
        while (i <= n) {
            System.out.print(i + " = ");
            j = i;
            k = 0;
            while (j > 0) {
                if (j % 10 == 3) {
                    System.out.print("Foo");
                    k = 1;
                } else {
                    if (j % 10 == 5) {
                        System.out.print("Bar");
                        k = 1;
                    } else {
                        if (j % 10 == 7) {
                            System.out.print("Qix");
                            k = 1;
                        }
                    }
                }
                j = j / 10;
            }
            if (i % 3 == 0) {
                System.out.print("Foo");
                k = 1;
            }
            if (i % 5 == 0) {
                System.out.print("Bar");
                k = 1;
            }
            if (i % 7 == 0) {
                System.out.print("Qix");
                k = 1;
            }
            if (k == 0)
                System.out.print(i);
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        compute(n);
    }
}
