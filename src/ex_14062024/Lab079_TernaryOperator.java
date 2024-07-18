package ex_14062024;

public class Lab079_TernaryOperator {
    public static void main(String[] args) {
        //Ternary Operator
        // if true ? do this : do that

        int result = 10>40 ? 89 : 91;
        System.out.println(result);//91

        int a1 = (30>40)?10:20;
        System.out.println(a1);//20

        String str = 10>20 ? "10" : "TWENTY";
        System.out.println(str);//TWENTY
    }
}
