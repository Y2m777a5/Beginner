import java.util.Scanner;
public class Task_6 {
   
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String out = "";
    String sout = "";
    int count = 0;
    int slcount = 0;
    int clcount = 0;
    int dcount = 0;
    int sChcount = 0;
    
    for(int i=0; i<str.length(); i++)
    {
      int num = (int)str.charAt(i);
     if(str.length()>=8)
     {
       if(num>=(int)'a' && num<=(int)'z')
       {
         if(slcount==0)
         {
           slcount++;
         }
         else{          
           continue;
         }
      }
      else if(num>=(int)'A' && num<=(int)'Z')
      {
        if(clcount==0)
        {
         clcount++;
        }
        else{
         continue;
        }
      }
      else if(num>=(int)'0' && num<=(int)'9')
      {
        if(dcount==0)
        {
         dcount++;
        }
        else{
         continue;
        }
      }
      else if(num!=(int)' ' && sChcount==0)
      {
        sChcount++;
      }
     }
     else{
      count--; 
      break;
     }
    }
    count++;
    int total = count+ slcount+ clcount+ dcount+ sChcount;
    if(total==5)
    {
     System.out.println("True");
    }
    else
    {
     System.out.println("False");
    }
    sc.close();
  }
}
