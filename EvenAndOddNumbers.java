package com.company;
import java.util.Scanner;


public class EvenAndOddNumbers {

    public static void main(String[] args) {
        // to check even and odd numbers
        System.out.println("take input from user : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num / 2 == 0) {
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " is a odd number");
        }
    }
}
