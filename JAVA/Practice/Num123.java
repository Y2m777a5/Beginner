/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Num123 {
  
  
  public static void main(String[] args) { 
    System.out.print("Enter the Student serial : ");
    Scanner sc = new Scanner(System.in);
    String std = sc.next().toUpperCase();
    int len = std.length();
    String out = "";
    while(len>0){
      out="";
      for (int i = 0; i<len; i+=2){
        String temp1 = ""+std.charAt(i);
        String temp2 ="";
        if(i+1<len){
          temp2 = ""+std.charAt(i+2);
        }
        if(temp1.equals("B") && temp2.equals("G")){
          out+=temp2+temp1;
          i++;
        }
        else if (temp1.equals("G")){
          out+=temp1;
        }
        else{
          out+=temp1;
        }
      }
      len--;
      std=out;
    }
    System.out.println(out);
    sc.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
