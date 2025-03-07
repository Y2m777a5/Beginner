import java.util.Scanner;
public class Task_4 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine().toLowerCase();
    int flag = 1;
    String out = "";
    
    for(int i=0; i<str1.length() ; i++)
    {
     int strNum =(int)str1.charAt(i);
     String str2 = "" + str1.charAt(i);
     if(strNum>=(int)'a' && strNum<=(int)'z')
     {
      if(flag == 1)
      {
       out += str2;
       flag = 0;
      }
      else
      {
       out += str2.toUpperCase();
       flag = 1;
      }
     }
     else
     {
      out += str2;
     }
    }
    System.out.println(out);
    sc.close();
  }
}
