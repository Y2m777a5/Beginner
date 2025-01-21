import java.util.Scanner;
public class Task_4 
{
  
  public static void main(String[] args) 
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Input side1: ");
    int side1 = sc.nextInt();
    System.out.println("Input side2: ");
    int side2 = sc.nextInt();
    System.out.println("Input side3: ");
    int side3 = sc.nextInt();
    
   if((side1==side2)&&(side2==side3))
    {
     System.out.println("This is a equilateral triangle"); 
   }
   else if((side1==side2)||(side2==side3)||(side3==side1))
    {
     System.out.println("This is a Isosceles triangle"); 
   }
   else
    {
     System.out.println("This is a Scalene triangle");
    }
 
  }
  
  /* ADD YOUR CODE HERE */
  
}
