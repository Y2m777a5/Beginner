import java.util.Scanner;

public class Task_1 
{

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number1 _ ");
    int num1 = scanner.nextInt();
    
    System.out.println("Please enter the number2 _ ");
    int num2 = scanner.nextInt();
    
    System.out.println("Please enter operator(+,-,*,/)");
    String optr = scanner.next();
   
    
      if (optr.equals("+")) 
      {
       System.out.println(num1+num2);
      }
      else if (optr.equals("-")) 
      {
       System.out.println(num1-num2);
      }
      else if (optr.equals("*")) 
      {
       System.out.println(num1*num2);
      }
      else if (optr.equals("/")) 
      {
        if ((num2!=0))
        {
          System.out.println(num1/num2);
        }
        else
        {
          System.out.println("number2 is zero");
        }
      }
     else
      {
       System.out.println("Invalid operator");
      } 
    
    /* switch (operator)
    {
     case "+" :
      {
       System.out.println(num1+num2);
       break;
      }
      case "-" :
      {
       System.out.println(num1-num2);
       break;
      }
      case "*" :
      {
       System.out.println(num1*num2);
       break;
      }
      case "/" :
      {
        if ((num2!=0))
        {
          System.out.println(num1/num2);
        }
        else
        {
          System.out.println("number2 is zero");
        }
       break;
      }
     default :
      {
       System.out.println("Invalid operator");
      }     
    }*/
  }
}




