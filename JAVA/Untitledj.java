import java.util.Scanner;
class Untitledj
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 4 digits number _ ");
        int x = scanner.nextInt();

        if(x >= 10000 || x<1000)
        {
            System.out.println("You moron I said 4 digits");
        }
        else{
            int y = x/100;

            if( y > 10 )
            {
                System.out.println(y);
            }
            else
            {
                System.out.println("0" + y);
            }
        }
    }
}