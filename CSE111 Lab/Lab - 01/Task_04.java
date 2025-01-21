import java.util.Scanner;
public class Task_04 {
  
  
  public static void main(String[] args) { 
    
    System.out.println("Task_04");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter positive number :");
    int n = sc.nextInt();
    int i = 1;
    
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    System.out.println(n+" x "+ i +" = "+(n*i++));
    sc.close();
  }

}
