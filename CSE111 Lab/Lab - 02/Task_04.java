import java.util.Scanner;
public class Task_04 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Task_04");
    
    int sum = 0;
    int min = 0;
    int max = 0;
    int avg = 0;
    int count = 0;
    for(int i=0; i<10; i++){
      int x=sc.nextInt();
      if(x%2!=0 && x>0){
        sum+=x;
        count++;
        if(count==1){
          min=x;
          max=x;
        }
        else{
          if(x>max){
            max=x;
          }
          if(x<min){
            min=x;
          }
        }
      }
      else{
        continue;
      }
    }
    double av=sum/(double)count;
    if(count==0){
      System.out.println("No odd positive numbers found");
    }
    else{
      System.out.println("Sum = "+sum);
      System.out.println("Minimum = "+min);
      System.out.println("Maximum = "+max);
      System.out.println("Average = "+av);
    }
  }
}
