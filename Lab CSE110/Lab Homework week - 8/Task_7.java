import java.util.Scanner;
public class Task_7 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("str1 = ");
    String str1 = sc.nextLine();
    System.out.print("str2 = ");
    String str2 = sc.nextLine();
    int count = 0;
    String newStr12 = "";
    
    for(int i=0; i<str1.length(); i++)
    {
      String newStr11 = ("" + str1.charAt(i));
      if(i<str1.length()-1){
        newStr12 = ("" + str1.charAt(i+1));
      }
      else
      {
       newStr12 = "";
      }
      String out = newStr11 + newStr12;
     if(str2.equals(out))
     {
      count++;
     }
     else{
      continue;
     }
    }
    System.out.println("Occurrence: "+count+" times");
    sc.close();
  }
}
