
public class Task_02 {
  
  
  public static void main(String[] args) {
    
    System.out.println("Task_02");
    
    //Approach_1;
    int x = 5;
    int y = 6;
    int z = y;
    y = x;
    x = z;
    System.out.println(x);
    System.out.println(y);
    
    //Approach_2;
    int a = 5;
    int b = 6;
    a=(a+b);
    b=a-b;
    a-=b;
    System.out.println(a);
    System.out.println(b);
  }

}
