package ex_20072024;

import java.util.Scanner;

public class Assignment1_TriangleClassifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of side1");
        int side1 = sc.nextInt();

        System.out.println("Enter the value of side2");
        int side2 = sc.nextInt();

        System.out.println("Enter the value of side3");
        int side3 = sc.nextInt();

        sc.close();

        String triangleType = classifyTriangle(side1, side2, side3);
        System.out.println(triangleType);
    }

    public static String classifyTriangle(int side1, int side2, int side3)
    {
        if(side1==side2 && side2==side3)
        {
            return "Triangle is equilateral";
        } else if ((side1==side2 || side2==side3 || side3==side1) ) {
            return "Triangle is isosceles";
        } else
            return "Triangle is scalene";
    }
}
