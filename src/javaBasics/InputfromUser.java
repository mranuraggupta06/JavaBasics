package javaBasics;
import java.util.Scanner;

public class InputfromUser {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double rad = sc.nextDouble();
        System.out.println(rad);

    }
}
