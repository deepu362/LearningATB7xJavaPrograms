package ex_20072024;

import java.util.Scanner;

public class Lab103_IfElseIfElseExample {
    public static void main(String[] args) {
        // WAP to check if number is positive, negative or zero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num>0)
            System.out.println("Positive number");
        else if(num<0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }
}
