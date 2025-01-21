import java.util.Scanner;
public class Task_5 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Given String 1: ");
    String str1 = sc.nextLine();
    System.out.print("Given String 2: ");
    String str2 = sc.nextLine();
    int count = 0;
    
    for(int i=0; i<str1.length(); i++)
    {
     String newStr11 = "" + str1.charAt(i);
     String newStr12 = ("" + str1.charAt(i)).toLowerCase();
     for(int j=0; j<str2.length(); j++)
     {
       String newStr2 = ("" + str2.charAt(j)).toLowerCase();
       if(newStr12.equals(newStr2))
       {
        count++;
       }
     }
     if(count==0)
     {
      System.out.print(newStr11);
     }
     else
     {
      count = 0;
     }
    }
    sc.close();
  }
}
