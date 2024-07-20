package ex_14072024;

public class Lab057_TypeCasting2 {

    public static void main(String[] args) {
        long phone_no = 9876543210l;
        short s = (short) phone_no;//Explicit Narrowing
        System.out.println(s);
    }
}
