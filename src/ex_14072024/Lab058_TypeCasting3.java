package ex_14072024;

public class Lab058_TypeCasting3 {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
//      int total_price = course+(int)gst;
//      System.out.println(total_price);//118 - We are losing 0.45 rupees, so there is loss of data in Explicit Narrowing.

        float total_price = course+gst;
        System.out.println(total_price);//118.45
    }
}
