package ex_14062024;

public class Lab063_IncrDecrPart4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);//22
        System.out.println(a);
        //A = a++ -> Exp = 10, a = 11
        //+ - operator
        //B = ++a -> Exp = 12, a = 12
    }
}