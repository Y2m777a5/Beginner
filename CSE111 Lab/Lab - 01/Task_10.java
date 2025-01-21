import java.util.Scanner;
public class Task_10 {
  
  
  public static void main(String[] args) { 
    
    System.out.println("Task_10");
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    if(num%2==0 && num%5==0){
      System.out.println("Multiple of 2 and 5 both");
    }
    
    else if(num%2==0){
      System.out.println(num);
    }
    
    else if(num%5==0){
      System.out.println(num);
    }
    
    else{
      System.out.println("Not a multiple we want");
    }
    sc.close();
  }

}
