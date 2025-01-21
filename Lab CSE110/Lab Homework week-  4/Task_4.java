import java.util.Scanner;
public class Task_4 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
    int i = 0;
    
    while(num!=0){
     
    num = num / 10;
     
      i=i+1;
    }
    System.out.println("Total digits ="+i);
  }
  
  /* ADD YOUR CODE HERE */
  
}
