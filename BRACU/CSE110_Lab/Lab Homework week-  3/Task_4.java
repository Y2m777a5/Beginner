import java.util.Scanner;
public class Task_4 {
  
  
  public static void main(String[] args)
  { 
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your student ID");
        int sID = scanner.nextInt();
        
        int year = sID / 1000000 ;
        int F3digit = sID / 100000 ;
        int session = F3digit % 10 ;
        
       
          if (session==1)
          {
            System.out.println("Student Joined BRAC in Spring "+year);
            
          }
          else if (session==2)
          {
            System.out.println("Student Joined BRAC in Fall "+year);
            
          }
          else if (session==3)
          {
            System.out.println("Student Joined BRAC in Summer "+year);
            
          }
          else
          {
            System.out.println("Ivalid Student ID");
          }
        
        
      /*  switch (session)
        {
          case 1 :
          {
            System.out.println("Student Joined BRAC in Spring "+year);
            break;
          }
          case 2 :
          {
            System.out.println("Student Joined BRAC in Fall "+year);
            break;
          }
          case 3 :
          {
            System.out.println("Student Joined BRAC in Summer "+year);
            break;
          }
          default :
          {
            System.out.println("Ivalid Student ID");
          }
        } */
  }
  
  /* ADD YOUR CODE HERE */
  
}
