import java.util.Scanner;
public class Task_5 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int pow = 0;
    int count = num;
    while(count!=0){
     
    count = count / 10;
     
      pow=pow+1;
    }
    
    pow=pow-1;
    int j=1;
    int initialPow= 1;
 
    while(j<=pow){
    initialPow = initialPow * 10;
    j++;
    }
    int pOf10 = initialPow ;
  
    while(num!=0) 
    {
    int Digit = num / pOf10;
    
    if(pOf10>=10){
      System.out.print(Digit);
    System.out.print(", ");}
    
    else if(pOf10==1){System.out.println(Digit);}
    
    num = num % pOf10;
    pOf10 = pOf10/10;
    
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}