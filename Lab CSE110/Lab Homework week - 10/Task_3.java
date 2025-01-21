import java.util.Scanner;

public class Task_3 {
  public static double calcTax(int a, double b){
    double tax;
    if(a >18){
      if(b>=10000.0 && b<=20000.0){
        tax= 0.07*b;
      }
      else if(b>20000.0){
        tax= 0.14*b;
      }
      else{
        tax= 0.0;
      }
    }
    else{
      tax= 0.0;
    }
    return tax;
  }
  
  public static void calcYearlyTax(){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    double [] arr = new double [12];
    
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextDouble();
    }
    int j=1;
    double sum = 0;
    for(int i=0; i<arr.length; i++){
      sum += calcTax(age, arr[i]);
      System.out.println("Month"+(j++)+" tax: "+calcTax(age, arr[i]));
    }
    System.out.println("Total Yearly Tax: "+sum);
  }
  
  public static void main(String[] args) { 
    double t = calcTax(16,20000);
    System.out.println(t);
    t = calcTax(20,18000);
    System.out.println(t);
    
    calcYearlyTax();
  }
  
  /* ADD YOUR CODE HERE */
  
}
