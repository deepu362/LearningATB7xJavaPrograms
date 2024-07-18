package ex_14062024;

public class Lab056_TypeCasting {
    public static void main(String[] args) {
        //Type Casting - Source and Destination conversion

        byte b = 10;
        int a = b;//Implicit casting, done by JVM automatically -> This is called WIDENING.
        System.out.println(a);

        int val = 300;
        byte b1 = (byte) val;//Explicit casting - This is called NARROWING. There is Loss of data.
        System.out.println(b1);
    }
}
