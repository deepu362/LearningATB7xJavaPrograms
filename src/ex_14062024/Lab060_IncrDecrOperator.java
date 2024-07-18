package ex_14062024;

public class Lab060_IncrDecrOperator {
    public static void main(String[] args) {
        //Increment(++)/Decrement(--) operators
        //Pre and Post
        //Ready

        //pre-increment, ++operand
        //value is incremented first and then stored in the result.

//        int a = 10;
//        int b = ++a;
//        //Exp = 11, a = 11
//        System.out.println(a);
//        System.out.println(b);

        int a = 10;
        System.out.println(++a);
        //Exp = 11, a = 11

        //POST
        //Value is stored in the result and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        //Exp = 10, a_post = 11

    }
}
