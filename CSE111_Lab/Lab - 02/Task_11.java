import java.util.Scanner;
public class Task_11 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Task_11");
    
    //Task_A
    int x = sc.nextInt();
    for(int i=0; i<x; i++){
      for(int j=0; j<x; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    //Task_B
    int y = sc.nextInt();
    for(int i=1; i<=y; i++){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
