import java.util.Scanner;
import java.lang.Math;
public class Untitled {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number of terms:");
    int num = sc.nextInt();
    int sum = (int)Math.pow(10,num);
  System.out.println("The Sum : "+sum);
  }}