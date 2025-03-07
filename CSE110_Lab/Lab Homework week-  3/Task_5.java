import java.util.Scanner;
public class Task_5 {
  
  
  public static void main(String[] args) 
  { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your payment ");
    int Inc = scanner.nextInt();
    
    System.out.println("Please enter your age ");
    int age = scanner.nextInt();
    
     /* if (age >= 18)
    {
      if ((Inc >= 10000) && (Inc <= 20000))
      {
        System.out.println("Your tax amounts in "+(int)(Inc*0.05)+" Tk");
      }
      else if (Inc > 20000)
      {
        System.out.println("Your tax amounts in "+(int)(Inc*0.1)+" Tk");
      }
      else
      {
        System.out.println("Your tax amounts in 0 Tk");
      }
     }
     else
     {
       System.out.println("Your tax amounts in 0 Tk");
     }*/
      
      if ((age >= 18) && (Inc >= 10000) && (Inc <= 20000))
      {
        System.out.println("Your tax amounts in "+(int)(Inc*0.05)+" Tk");
      }
      else if ((age >= 18) && (Inc > 20000))
      {
        System.out.println("Your tax amounts in "+(int)(Inc*0.1)+" Tk");
      }
      else
      {
        System.out.println("Your tax amounts in 0 Tk");
      }  
  }
  
  /* ADD YOUR CODE HERE */
  
}
