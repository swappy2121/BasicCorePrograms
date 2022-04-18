package com.company;
import java.util.Scanner;



public class QuotientCalculation {

    public static void main(String[] args) {
        // calculate quotient
        System.out.println("write a number between 1 to 50 to get quotient : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int quotient;
        for ( i=1; i<50; i++) {

            quotient = i/num;
            System.out.println("quotient is : "+quotient );
        }

    }
}
