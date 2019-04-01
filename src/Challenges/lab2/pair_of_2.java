package Challenges.lab2;

import java.util.Scanner;

public class pair_of_2 {
    public static void pairs(int v[]) {
        int k=0;
        for (int i=0;i<10-1;i++) {
            for (int j = i + 1; j < 10; j++)
                if (v[i] + v[j] == 0)
                    k++;
        }
        System.out.println("k = "+k);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = input.nextInt();
        pairs(array);
    }
}
