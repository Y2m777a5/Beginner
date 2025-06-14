import java.util.Scanner;
public class StrPrac_1 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str2 = sc.next();
    String str3 = sc.next();
    String temp = "";
    String sum ="";
    int len = str2.length();
    
    for(int i=0; i<str.length(); i++){
      if(str.length()-i >= len){
      for(int j=i; j <= (i+(len-1)); j++){
        temp+=str.charAt(j);
      }
      if(temp.equals(str2)){
        sum+=str3;
        i+=(len-1);
      }
      else{
        sum+=str.charAt(i);
      }
      }
      else{
        sum+=str.charAt(i);
      }
      temp="";
    }
    System.out.println(sum);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
