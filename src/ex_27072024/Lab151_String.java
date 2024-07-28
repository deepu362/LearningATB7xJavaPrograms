package ex_27072024;

public class Lab151_String {
    public static void main(String[] args) {
        // String - Bunch of Chars.

        String s1 = new String("pramod"); // Heap Area
        String s2 = "pramod"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());

        String s3 = "flow";
        String s4 = "flower";
        System.out.println(s3.indexOf(s4));//Starting Index of 'flower' in 'flow' i.e. -1 means No Index.

        String s5 = "flower";
        String s6 = "flow";
        System.out.println(s5.indexOf(s6));//Starting Index of 'flow' in 'flower' i.e. 0th Index.
    }
}
