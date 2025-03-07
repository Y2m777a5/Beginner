import java.util.Scanner;
public class Task_05 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Task_05");
    
    int sum = 0;
    int min = 0;
    int max = 0;
    int avg = 0;
    int count = 0;
    int tnum = 0;
    while(count!=3){
       int x = sc.nextInt();
       if(x==0){
         count++;
       }
       else{
         count=0;
         sum+=x;
         tnum++;
         if(tnum==1){
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
    }
    if(tnum==0){
      System.out.println("No odd positive numbers found");
    }
    else{
      double av=sum/(double)tnum;
      System.out.println("Sum = "+sum);
      System.out.println("Minimum = "+min);
      System.out.println("Maximum = "+max);
      System.out.println("Average = "+av);
    }
  }
}
