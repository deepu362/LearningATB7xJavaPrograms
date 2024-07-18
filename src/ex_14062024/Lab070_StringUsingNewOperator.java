package ex_14062024;

public class Lab070_StringUsingNewOperator {
    public static void main(String[] args) {
        String s1 = new String("Pramod");
        String s2 = new String("Pramod");
        //2 Strings created in Heap Area
        String s3 = s1;
        //2 Strings only in Heap, only s3 is pointing to s1 i.e. Pramod.


    }
}
