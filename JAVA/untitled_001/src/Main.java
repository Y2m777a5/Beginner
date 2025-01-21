import java.util.Scanner;
 class Classwork_001
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your marks");
        int n = sc.nextInt();

        if((n <= 100) && (n >= 90))
        {
            System.out.println("The grade is A+");
        }
        else if((n <= 89) && (n >= 80))
        {
            System.out.println("The grade is A");
        }
        else if((n <= 79) && (n >= 70))
        {
            System.out.println("The grade is B");
        }
        else if((n <= 69) && (n >= 60))
        {
            System.out.println("The grade is C");
        }
        else if((n <= 59) && (n >= 50))
        {
            System.out.println("The grade is D");
        }
        else if((n <= 49) && (n >= 0))
        {
            System.out.println("The grade is F");
        }
        else
        {
            System.out.println("Invalid numbers");
        }
    }

    /* ADD YOUR CODE HERE */

}
