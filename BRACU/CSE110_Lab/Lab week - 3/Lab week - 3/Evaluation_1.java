import java.util.Scanner;
public class Evaluation_1 
{ 
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("input num1");
    int num1 = sc.nextInt();
    System.out.println("input num2");
    int num2 = sc.nextInt();
    System.out.println("input num3");
    int num3 = sc.nextInt();
    
    if((num1<num2)&&(num1<num3))
    {
    System.out.println("smallest number: "+num1);
    
  }
    else if((num2<num1)&&(num2<num3))
    {
    System.out.println("smallest number: "+num2);
    
  }
    else{
    System.out.println("smallest number: "+num3);
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
