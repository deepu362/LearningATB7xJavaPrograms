package ex_27072024;

public class Lab152_StringBuilderStringBuffer {
    public static void main(String[] args) {
        // Strings - immutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("Ji"); //PramodDutta
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        stringBuilder.append("Ji");
        System.out.println(stringBuilder);

        // Thead Safety?

        // stringBuilder - not thread safe - people LOVE it :)
    }
}
