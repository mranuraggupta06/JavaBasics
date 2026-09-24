package javaBasics;

import java.util.Scanner;

public class simpleInterest {
    public static void main (String []args){
        double principle_amount , rate;
        int time;
        //input from user principle , rate and time
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        principle_amount = sc.nextDouble();
        System.out.println("Enter the rate: ");
        rate = sc.nextDouble();
        System.out.println("Enter the time: ");
        time = sc.nextInt();
        // calculation of the simple interest
        double simple_Interest = (principle_amount * rate * time )/100 ;
        System.out.println("simple interest is: " + simple_Interest);
    }
}
