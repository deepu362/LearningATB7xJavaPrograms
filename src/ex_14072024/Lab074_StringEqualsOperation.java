package ex_14072024;

public class Lab074_StringEqualsOperation {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        //1 String created in SCP

        String name2 = new String("The Testing Academy");
        String name3 = new String("The Testing Academy");
        //2 Strings created in Heap

        System.out.println(name==name1);//Check for the ref/location - True(as both the String are in SCP)
        System.out.println(name.equals(name1));//Check for the Content - True

        System.out.println(name1==name2);//Checks for the ref/location - False (as 1 String is in SCP and another in Heap)
        System.out.println(name1.equals(name2));//Check for the Content - True

    }
}
