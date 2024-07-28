package ex_27072024;

import java.util.Scanner;

public class Lab146_AvgOf5Subjects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the subject "+(i+1));
            marks[i] = sc.nextFloat();
        }

        // Optionally, you can print out the marks to verify input
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of subject "+(i+1)+": "+marks[i]);
        }

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Average is "+avg);

        sc.close();

    }
}
