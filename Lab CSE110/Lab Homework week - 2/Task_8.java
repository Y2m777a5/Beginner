import java.lang.Math;
public class Task_8 {
  
  
  public static void main(String[] args) { 
    int a = 8;
    int A = a/2;
    int b = 3;
    double B = Math.sqrt(3);
    double c = Math.sqrt((A*A)+(b*b));
    double area = (((3*B)/2)*(c*c));
    double circumference = (c*6);
    System.out.println("Area: "+area);
    System.out.println("Circumference: "+circumference);
  }

}
