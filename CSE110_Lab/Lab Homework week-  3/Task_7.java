import java.util.Scanner;
public class Task_7 
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka)");
    int take = scanner.nextInt();
    
    System.out.println("Enter the amount, customer gave(Taka)");
    int gave = scanner.nextInt();

    if(gave > take)
    {
      int g1= gave-take;
      System.out.println("The returned amount is "+g1+" taka.");
      int r1 = g1/100; 
      System.out.println("100 taka note: "+r1);
      int r2 = g1 - (r1*100);  
      int r3 = r2 / 50;        
      System.out.println("50 taka note: "+r3);
      int r4 = r2 - (r3*50);  
      int r5 = r4 / 20;    
      System.out.println("20 taka note: "+r5);
      int r6 = r4 - (r5*20); 
      int r7 = r6 / 10;      
      System.out.println("10 taka note: "+r7);
      int r8 = r6 - (r7*10);
      int r9 = r8 / 5;
      System.out.println("5 taka coin: "+r9);
      int r10 = r8 - (r9*5);
      int r11 = r10 / 2;
      System.out.println("2 taka coin: "+r11);
      int r12 = r10 - (r11*2);
      int r13 = r12 / 1;
      System.out.println("1 taka coin: "+r13);
    }
    else if (gave < take)
    {
      System.out.println("Please pay "+(take - gave)+" taka more.");
    }
    else
    {
      System.out.println("The returned amount is 0 taka.");
    }
  
  
  }}
