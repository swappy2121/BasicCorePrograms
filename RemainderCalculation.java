package com.company;
import java.util.Scanner;

public class RemainderCalculation {

    public static void main(String[] args) {
        //calculate remainder
        System.out.println("write a number between 1 to 50 to get remainder : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int r = 0;
        int remainder;
        for ( r=1; r<50; r++) {

            remainder = r%value;
            System.out.println("remainder is : "+remainder );
        }



    }
}
