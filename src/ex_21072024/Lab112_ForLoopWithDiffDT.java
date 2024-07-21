package ex_21072024;

public class Lab112_ForLoopWithDiffDT {
    public static void main(String[] args) {

        final boolean b1 = true;

//        for (int i=0;b1;i++){
//           System.out.println("Hello");//Infinite loop
//        }

//        for (int i=0;;) {
//            System.out.println("Hello");//Infinite loop
//        }

//         for (;;) {
//            System.out.println("Hello");//Infinite loop
//         }

        for(float f=0.0f;f<10.67;f++){
            System.out.println("Hi,Float -> "+ f);
        }

        for(byte b=0;b<10.67;b++){
            System.out.println("Hi,Byte -> "+ b);
        }

    }
}
