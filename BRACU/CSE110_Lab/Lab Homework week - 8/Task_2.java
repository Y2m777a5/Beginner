import java.util.Scanner;
public class Task_2 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = ""+str.charAt(0);
    int count = 0;
    
    for(int i=0; i<str.length(); i++)
    {
      String str2 = ""+ str.charAt(i);
      if(str1.equals(str2))
      {
       count++;
      }
      else
      {
       System.out.print(""+str.charAt(i-1)+count);
       count=1;
       str1 = ""+str.charAt(i);
      }      
    }
    System.out.print(""+str.charAt(str.length()-1)+count);
    sc.close();
  }
}
