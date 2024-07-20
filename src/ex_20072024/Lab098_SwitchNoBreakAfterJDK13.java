package ex_20072024;

public class Lab098_SwitchNoBreakAfterJDK13 {
    public static void main(String[] args) {
        //JDK > 13

        int itemcode = 001;

        switch (itemcode)
        {
            case 001 ->
                System.out.println("It's a Laptop");//If you use arrows, no need to use break

            case 002 ->
                System.out.println("It's a Desktop");

            case 003,004 -> System.out.println("It's a Mobile");

            default ->
                System.out.println("None");

        }

    }
}
