import java.util.Scanner;
public class Task_09 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Task_09");
    
    //Task_A
    int num = sc.nextInt();
    int dcount=0;
    while(num!=0){
      num/=10;
      dcount++;
    }
    System.out.println(dcount+" digits");
    
    //Task_B
    int n = sc.nextInt();
    int n2=n;
    int count=0;
    while(n2!=0){
      n2/=10;
      count++;
    }
    int p10=count-1;
    int vop10 = 1;
    for(int i=0; i<p10; i++){
     vop10*=10;
    }
    int digit=0;
    while(vop10!=0){
      digit = n/vop10;
      System.out.print((digit*7)+" ");
      n%=vop10;
      vop10/=10;
    }
  }
}
