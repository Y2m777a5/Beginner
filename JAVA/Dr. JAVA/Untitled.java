
import java.util.Scanner;
import java.lang.Math;

class Untitiled 
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number");
    int num = sc.nextInt();
    int count = num;
    
    // total digit counting
    int dcount=-1;
    while(count!=0){
     count=count/10;
     dcount++;
    }
    
    // reversing numbers
    int onum = num;
    int sum = 0;
    while(dcount>=0) {
     int digit = onum%10;
     onum =  onum/10;
     int rdigit =(int)Math.pow(10,dcount)*digit;
     
     sum = sum +rdigit;
    dcount--; 
    
    }
   
  if(sum == num){System.out.println("Palindrome number");}
    else {System.out.println("Not a palindrome number");}
  }
}
  /* ADD YOUR CODE HERE */

