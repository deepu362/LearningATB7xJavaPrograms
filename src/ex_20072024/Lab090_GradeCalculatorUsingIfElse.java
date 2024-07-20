package ex_20072024;

import java.util.Scanner;

public class Lab090_GradeCalculatorUsingIfElse {
    public static void main(String[] args) {
        //Grade Calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student score");
        int score = sc.nextInt();

        char grade = 'F';

        if (score>=90 && score<=100)
            grade = 'A';
        else if (score>=80 && score<=89)
            grade = 'B';
        else if (score>=70 && score<=79)
            grade = 'B';
        else if (score>=60 && score<=69)
            grade = 'B';
        else if (score<=0 || score>100)
        {
            System.out.println("LOL! Are you God!");
            grade = 'O';
        }
        else
            grade = 'F';

        System.out.println("Your Grade is -> "+grade);

        sc.close();
    }
}
