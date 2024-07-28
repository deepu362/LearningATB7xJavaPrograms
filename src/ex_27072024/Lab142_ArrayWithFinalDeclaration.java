package ex_27072024;

public class Lab142_ArrayWithFinalDeclaration {
    public static void main(String[] args) {
        final int[] ages = new int[4];
        ages[3] = 78;//It will print 78 only as using final above will only fix the length of the array
        System.out.println(ages[3]);

        final int a = 10;
        //a = 90;--> Not possible
    }
}
