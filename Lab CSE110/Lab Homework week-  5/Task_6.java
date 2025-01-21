import java.util.Scanner;
public class Task_6 {
  public static void main(String[] args) { 
     Scanner sc= new Scanner(System.in);
     
        System.out.println("Start: ");
        int low =sc.nextInt();
        
        System.out.println("Stop: ");
        int up =sc.nextInt();
        
        for(int i=low;i<=up;i++){
          System.out.println("Times Table of "+i+":");
          
          for(int j=1;j<=10;j++){
            System.out.println(i+" x "+j+" = "+(i*j));
          }
        }
        sc.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
