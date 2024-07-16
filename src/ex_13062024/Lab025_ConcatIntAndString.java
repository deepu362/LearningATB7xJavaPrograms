package ex_13062024;

public class Lab025_ConcatIntAndString {

    public static void main(String[] args) {
        int a = 10;
        int b = 34;

        System.out.println(a+b);

        String s1 = "Pramod";
        String s2 = "Dutta";
        System.out.println(s1+s2);

        String s3 = "Amit";
        int x = 99;
        int y = 100;
        System.out.println(x+y);//199
        System.out.println(x+s3);//99Amit
        System.out.println(s3+y);//Amit100
        System.out.println(x+y+s3);//199Amit
        System.out.println(s3+x+y);//Amit99100
        System.out.println(x+s3+y);//99Amit100

        System.out.println(x+y+s3+y+s3+x+y);//199Amit100Amit99100

    }
}
