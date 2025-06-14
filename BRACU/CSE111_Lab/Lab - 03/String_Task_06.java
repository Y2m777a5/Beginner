import java.util.Scanner;
public class String_Task_06 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("String_Task_06");
    String str = sc.nextLine();
    int len = str.length();
    String out = "";
    for(int i=0; i<len; i++){
      char chr = str.charAt(i);
      if(i==0){
        out+=chr;
      }
      else{
        char chr2 = str.charAt(i-1);
        if(chr2 == chr){
          continue;
        }
        else{
          out+=chr;
        }
      }
    }
    System.out.println(out);
  }
}
