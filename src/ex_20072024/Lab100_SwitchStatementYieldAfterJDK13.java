package ex_20072024;

public class Lab100_SwitchStatementYieldAfterJDK13 {
    public static void main(String[] args) {
        //JDK > 13

        char code = 'B';

        int val = switch (code)
        {
            case 'A':
                yield 65;//yield means return, no break statement is required
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };

        System.out.println(val);

    }
}
