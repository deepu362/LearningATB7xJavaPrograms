package ex_21072024;

import java.util.Scanner;

public class Lab136_FunctionsOrMethods2 {

    public static void main(String[] args) {

    /*
    4 types of functions or methods -

    1. Without Parameters and Without Return Type
    2. Without Parameters but With Return Type
    3. With Parameters and Without Return Type
    4. With Parameters and With Return Type

     */

        function_type1();

        System.out.println( " --------------- ");

        String name = function_type2();
        System.out.println(name);

        System.out.println( " --------------- ");

        function_type3("Amit");
        function_type3("123");

        System.out.println( " --------------- ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer a");
        int a = sc.nextInt();
        int sum_result = function_type4(a,5);
        System.out.println("Output -> "+sum_result);

    }

    // 1. Without Parameters and Without Return Type
    static void function_type1() {
        System.out.println("1. Without Parameters and Without Return Type");
    }

    // 2. Without Parameters but With Return Type
    static String function_type2() {
        System.out.println("2. Without Parameters but With Return Type");
        return "Pramod";
    }

    // 3. With Parameters and Without Return Type
    static void function_type3(String name){
        System.out.println("3. With Parameters and Without Return Type");
        System.out.println("You have shared -> " + name);
    }


    // 4. With Parameters and With Return Type
    static int function_type4(int a,int b){
        System.out.println("4. With Parameters and With Return Type");
        return a+b;
    }


}