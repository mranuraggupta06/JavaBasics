package javaBasics;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double num = sc.nextDouble();
        double square = num * num ;
        System.out.print(square);


    }
}
