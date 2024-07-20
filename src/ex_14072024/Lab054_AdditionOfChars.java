package ex_14072024;

public class Lab054_AdditionOfChars {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1;//ASCII values of A and B will get added i.e. 65+66 = 131
        System.out.println(c1);
        System.out.println('A'==65);//true
        System.out.println('B'==69);//false

    }
}
