package ex_20072024;

import java.util.Scanner;

public class Lab101_ScannerClassInputs {
    public static void main(String[] args) {
        //Write a program to print my name, age, salary

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Salary is "+salary);

        sc.close();
    }

}
