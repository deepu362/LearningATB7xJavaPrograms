package ex_20072024;

public class Lab097_SwitchMultipleCasesAfterJDK13 {
    public static void main(String[] args) {
        //JDK > 13

        int itemcode = 003;

        switch (itemcode)
        {
            case 001,002,003:
                System.out.println("Electronic Gadget");//We can use multiple options in 1 case
                break;

            case 004,005,006:
                System.out.println("Mechanical Gadget");
                break;

            default:
                System.out.println("None");

        }



    }
}
