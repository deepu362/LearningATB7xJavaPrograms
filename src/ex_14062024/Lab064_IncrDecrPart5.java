package ex_14062024;

public class Lab064_IncrDecrPart5 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);//23
        System.out.println(a);
        //A = ++a -> Exp = 11, a = 11
        //+ - operator
        //B = ++a -> Exp = 12, a = 12
        //Exp = A + B = 23, a = 12
    }
}
