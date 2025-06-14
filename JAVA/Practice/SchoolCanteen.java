import java.util.Scanner;
public class SchoolCanteen {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size : ");
    int len = sc.nextInt();
    System.out.print("Enter the time : ");
    int t = sc.nextInt();
    System.out.print("Enter the Student serial : ");
    String std = sc.next().toUpperCase();
    String out = "";
    while(t>0){
      out="";
      for (int i = 0; i<len; i++){
        String temp1 = ""+std.charAt(i);
        String temp2 ="";
        if(i+1<len){
          temp2 = ""+std.charAt(i+1);
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
      t--;
      std=out;
    }
    System.out.println(out);
    sc.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
