import java.util.Scanner;
public class Task_06 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Task_06");
    
    double sumWN = 0.0d;
    double sumW = 0.0d;
    for(int i=0; i<5; i++){
      double num = sc.nextDouble();
      int weight = sc.nextInt();
      System.out.println();
      sumWN += (weight*num);
      sumW += weight;
    }
    double wAvg = sumWN/sumW;
    System.out.println("Weighted Average = "+wAvg);
  }
}
