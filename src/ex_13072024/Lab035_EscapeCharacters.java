package ex_13072024;

public class Lab035_EscapeCharacters {
    public static void main(String[] args) {
        char c = '\n';//New Line/Next Line
        char c1 = '\t';//Add Tab
        char c2 = '\b';//Backslash, Delete 1 char
        char c3 = '\r';//Backslash, Delete 1 word
        System.out.println("Deepika" + c3 + "Girdhar");//Girdhar
        System.out.println("Deepika" + c2 + "Girdhar");//DeepikGirdhar
        System.out.println("Deepika" + c1 + "Girdhar");//Deepika Girdhar
        System.out.println("Deepika" + c + "Girdhar");//Deepika
                                                      // Girdhar
    }
}
