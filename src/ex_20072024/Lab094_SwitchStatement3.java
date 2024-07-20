package ex_20072024;

import java.util.Scanner;

public class Lab094_SwitchStatement3 {
    public static void main(String[] args) {
        //Take a user input and tell whether it is a vowel or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

//        switch (user_input)
//        {
//            case 'a':
//                System.out.println("Vowel");
//                break;
//
//            case 'e':
//                System.out.println("Vowel");
//                break;
//
//            case 'i':
//                System.out.println("Vowel");
//                break;
//
//            case 'o':
//                System.out.println("Vowel");
//                break;
//
//            case 'u':
//                System.out.println("Vowel");
//                break;
//
//            default:
//                System.out.println("Not a Vowel, but a consonant");
//
//        }

        switch (user_input)
        {
            case 'a','e','i','o','u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Not a Vowel, but a consonant");

        }


    }
}
