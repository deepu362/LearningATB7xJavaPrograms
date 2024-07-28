package ex_27072024;

public class Lab150_Printing2DArrayPart2 {
    public static void main(String[] args) {

        int[][] array_2d = {
                {34, 1},
                {34, 2},
                {34, 3}
        };

        for (int i = 0; i < array_2d.length; i++) { // Row  0,1
            for (int j = 0; j < array_2d[i].length; j++) { // Column , 0,1,2
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
