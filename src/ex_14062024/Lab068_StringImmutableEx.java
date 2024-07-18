package ex_14062024;

public class Lab068_StringImmutableEx {
    public static void main(String[] args) {
        String s1 = "Pramod";
        String s2 = new String("Pramod");

        //SCP and Heap

        //JVM Architecture - Consists of
        // CLass Loaders - They load class
        // Heap - It stores Objects - It stores Pramod (Memory is diff) - s2 will point to this
        //SCP (String Constant Pool) - It stores Pramod (Memory is diff) - s1 will point to this
        //String is immutable (which cannot be changed) in nature - Means if String s3 = "Dutta"
        //Dutta will be created in SCP, Now if I do this String s1 = "Amit", a new String Amit will ve created
        //and s1 will point to Amit. WHat will happen to Pramod ? It is a constant always present in the pool.
        //If do this now - String s1 = "Sharma". s1 will point to Sharma now and Amit will roam around in the pool.

    }
}
