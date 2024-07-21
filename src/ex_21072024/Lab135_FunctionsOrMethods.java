package ex_21072024;

public class Lab135_FunctionsOrMethods {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            greet();
        }

        greet2();
    }

    static void greet(){
        System.out.println("Hi, How are you?");
    }

    static void greet2(){
        System.out.println("greet2");
    }
}
