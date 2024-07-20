package ex_14072024;

public class Lab076_StringConcat {
    public static void main(String[] args) {
        String s1 = "Pramod";
        char c = s1.charAt(5);
        System.out.println(c);//d

        s1 = s1.concat("Dutta");
        System.out.println(s1);
    }
}
