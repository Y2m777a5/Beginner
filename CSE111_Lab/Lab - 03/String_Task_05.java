import java.util.Scanner;
public class String_Task_05 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("String_Task_05");
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String str = str1+" "+str2;
    int sum=0;
    for(int i=0; i<str.length(); i++){
      int lttr = (int)str.charAt(i);
      if((lttr>=(int)'A' && lttr<=(int)'Z') || (lttr>=(int)'a' && lttr<=(int)'z')){
        sum+=lttr;
      }
    }
    System.out.println(str);
    System.out.println(sum);
  }
}
