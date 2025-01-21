import java.util.Scanner;
public class Task_09 {
  
  
  public static void main(String[] args) { 
    
    System.out.println("Task_09");
    
    Scanner sc = new Scanner(System.in);
    float cgpa = sc.nextFloat();
    int crdt = sc.nextInt();
    
    if (crdt >=30){
      
      if(cgpa>=3.80 && cgpa<=3.89){
        System.out.println("The student is eligible for a waiver of 25 percent");
      }
      
      else if(cgpa>=3.90 && cgpa<=3.94){
        System.out.println("The student is eligible for a waiver of 50 percent");
      }
      
      else if(cgpa>=3.95 && cgpa<=3.99){
        System.out.println("The student is eligible for a waiver of 75 percent");
      }
      
      else if(cgpa==4.00){
        System.out.println("The student is eligible for a waiver of 100 percent");
      }
      
      else{
        System.out.println("The student is not eligible for a waiver");
      }
    }
    
    else{
      System.out.println("The student is not eligible for a waiver");
    }
    sc.close();
  }

}
