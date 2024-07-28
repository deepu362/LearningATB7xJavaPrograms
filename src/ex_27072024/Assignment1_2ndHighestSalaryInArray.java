package ex_27072024;

public class Assignment1_2ndHighestSalaryInArray {
    public static void main(String[] args) {
        int salary[] = {40, 30, 78, 56, 25};

        for(int i=0;i<salary.length;i++)
        {
            for(int j=i+1;j<salary.length;j++)
            {
                if(salary[i]>salary[j])
                {
                    int temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }
            }
        }
        System.out.println("Second Highest Salary is "+salary[salary.length-2]);
    }
}
