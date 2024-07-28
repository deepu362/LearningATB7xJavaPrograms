package ex_20072024;

import java.util.Scanner;

public class Assignment3_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = sc.nextInt();

        if(leapYear(year))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is NOT a leap year");
    }

    public static boolean leapYear(int year)
    {
        //A year is a leap year if “any one of” the following conditions are satisfied:
        //The year is multiple of 400.
        //The year is a multiple of 4 and not a multiple of 100.
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
