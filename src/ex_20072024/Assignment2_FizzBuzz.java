package ex_20072024;

import java.util.ArrayList;
import java.util.List;

public class Assignment2_FizzBuzz {
    public static void main(String[] args) {

         List<String> output = fizzBuzz(15);

        System.out.println(output);

//        for (String s :output)
//        {
//            System.out.println(s);
//        }
    }

    public static List<String> fizzBuzz(int n)
    {
        List<String> result = new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
                result.add("FizzBuzz");
            else if(i%3==0)
                result.add("Fizz");
            else if (i%5==0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }

        return result;
    }
}
