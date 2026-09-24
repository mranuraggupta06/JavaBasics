package javaBasics;

import java.util.Scanner;

public class sumofthreenumbers {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        double num1 , num2 , num3;
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();
        System.out.println("Enter the third number: ");
        num3 = sc.nextDouble();
        double sum = num1 + num2 + num3 ;
        System.out.println("The sum of three numbers is; " + sum);
    }
}
