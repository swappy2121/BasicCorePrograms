package com.company;
import java.util.Scanner;



public class WrittenPowerOf_2 {

    public static void main(String[] args) {
        //finding a power of 2

        System.out.println("take value of N from user : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (N = 0; N < 32; N++) {

            System.out.println("value is :2^" + N);

        }
    }
}
