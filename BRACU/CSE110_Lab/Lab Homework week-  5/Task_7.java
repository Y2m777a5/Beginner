import java.util.Scanner;
import java.lang.Math;
public class Task_7 { 
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);  
        int low =sc.nextInt();
        int up =sc.nextInt();
        int num =sc.nextInt();
        
        for(int i=low;i<=up;i++){
          int count=i;      
          int dcount;
          for(dcount=0;count!=0;dcount++){
           count/=10;
          }
          dcount--;
          int p10=(int)(Math.pow(10,dcount)); 
          int mul=1;
          int tempnum= i;
          
          while(p10!=0){
           mul*=tempnum/p10;
           tempnum=tempnum%p10;
           p10/=10;
           
          }
         
         if(mul%num==0){
            System.out.print(mul+" ");
          }
         }
         sc.close();
  }
  
  /* ADD YOUR CODE HERE */
  
}
