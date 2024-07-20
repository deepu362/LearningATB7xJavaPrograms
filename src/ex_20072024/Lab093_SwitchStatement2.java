package ex_20072024;

import java.util.Scanner;

public class Lab093_SwitchStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser name where you want to execute the code");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName)
        {
            case "chrome" :
                System.out.println("Starting the Chrome Browser");
                break;

            case "firefox" :
                System.out.println("Starting the Firefox Browser");
                break;

            case "edge" :
                System.out.println("Starting the Edge Browser");
                break;

            default:
                System.out.println("No idea which browser it is");

        }

    }
}
