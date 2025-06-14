public class Test
{
    public static void main(String[] args) throws Exception
    {
        System.out.print("Transfer is 0% complete");
        int length = 10; // length of % complete
        for (int i = 1; i <= 100; i++)
        {
            Thread.sleep(250);
            for (int j = 0; j < length + 1; j++) // + 1 handles the 1st digit
            {
                System.out.print('\b');
            }
            if (i > 10)
            {
                System.out.print('\b');
            }
            if (i > 100)
            {
                System.out.print('\b');
            }
            System.out.print(i);
            System.out.print("% complete");
        }
        System.out.println();
    }
}