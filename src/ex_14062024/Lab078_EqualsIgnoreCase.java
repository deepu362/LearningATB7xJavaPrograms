package ex_14062024;

public class Lab078_EqualsIgnoreCase {
    public static void main(String[] args) {
        String password = "Pramod@123";
        String pass_u = password.toLowerCase();

        System.out.println(pass_u == password);//false
        System.out.println(pass_u.equals(password));//false
        System.out.println(pass_u.equalsIgnoreCase(password));//true

        System.out.println(password.substring(0,3));//Pra
        System.out.println(password.indexOf('r'));//1
        System.out.println(password.length());//10
    }
}
