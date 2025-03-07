import java.util.Scanner;
public class Task_2 
{
  
  
  public static void main(String[] args) 
  { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number _ ");
    int num = scanner.nextInt();
    
    if (num % 5 == 0)
    {
      if(num % 7 == 0)
      {
        System.out.println("Divisible by Both");
      }
      else
      {
        System.out.println("Invalid: Divisible by 5 Only");
      }
    }
    else if (num % 7 == 0)
    {
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else
    {
      System.out.println("No");
    } 
    
/*  if ((num % 5 == 0) && (num % 7 == 0))
    {
       System.out.println("Divisible by Both");
    }
    else if (num % 5 == 0)
    {
       System.out.println("Invalid: Divisible by 5 Only");
    }
    else if (num % 7 == 0)
    {
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else
    {
      System.out.println("No");
    }  */
  }
  
  /* ADD YOUR CODE HERE */
  
}
