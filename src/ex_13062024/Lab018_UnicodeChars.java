package ex_13062024;

public class Lab018_UnicodeChars {

    public static void main(String[] args) {
        //byte b = 128; // Not possible because range of byte is -127 to 127

        char c = 'A';
        System.out.println(c);

        char c1 = '$';
        System.out.println(c1);

        char c2 = '\n';
        System.out.println(c2);

        char c3 = '\u1F6A';//unicode character
        System.out.println(c3);
        // :), :(, :D, ;) -> unicode chars
    }





}
