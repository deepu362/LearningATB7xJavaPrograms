package ex_14062024;

public class Lab067_String {
    public static void main(String[] args) {
        String name = "Pramod";
        //String - Bunch of Chars - Collection of Chars

        String name2 = new String("Pramod");

        //There are 2 ways to create a String
        // 1st way : = -> stores the values in "SCP" (String Constant Pool)
        // 2nd way : new -> stores the values in Objects/Heap format

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
       // System.out.println(name.charAt(10));//StringIndexOutOfBoundsException

    }
}
