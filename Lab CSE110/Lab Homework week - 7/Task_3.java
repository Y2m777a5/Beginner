import java.util.Scanner;
public class Task_3 
{
    
  public static void main(String[] args)
  { 
    Scanner sc= new Scanner(System.in);
    int col = sc.nextInt();
    int row = sc.nextInt();
    
    for(int i=1; i<=row; i++)
    {
      if(i==1 || i==row){
      for(int j=1; j<=col; j++)
      {
        System.out.print(j+" ");
      }
      }
      else
      {
        for(int j=1; j<=col; j++){
          if(j==1 || j==col)
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