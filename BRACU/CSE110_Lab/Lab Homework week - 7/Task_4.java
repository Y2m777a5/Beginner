import java.util.Scanner;
public class Task_4 {  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    for(int i=1; i<=num; i++)
    {
      if(i<=2 || i==num){
      for(int j=1; j<=i; j++)
      {
        System.out.print(j+" ");
      }
      }
      else
      {
        for(int j=1; j<=i; j++){
          if(j==1 || j==i)
          {
            System.out.print(j+" ");
          }
          else
          {
            System.out.print("  ");
          }
        }
     }
      System.out.println();
   }
    sc.close();
  }
}
