package ex_14062024;

public class Lab069_StringImmutableEx2 {
    public static void main(String[] args) {
        String s1 = "Pramod";//1 String created in SCP
        s1 = "Amit";//2 Strings created in SCP
        s1 = "Dutta";//3 Strings created in SCP
        s1 = "Pramod";//Still 3 Strings, as Pramod is already floating. This means Immutable i.e. reusable.


    }
}
