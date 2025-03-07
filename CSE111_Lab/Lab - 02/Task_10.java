import java.util.Scanner;
public class Task_10 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Task_10");
    
    int curnc = sc.nextInt();
    int n500=0;
    int n100=0;
    int n50=0;
    int n10=0;
    int n5=0;
    int n1=0;
    while(curnc >= 500){
      curnc-=500;
      n500++;
    }
    while(curnc >= 100){
      curnc-=100;
      n100++;
    }
    while(curnc >= 50){
      curnc-=50;
      n50++;
    }
    while(curnc >= 10){
      curnc-=10;
      n10++;
    }
    while(curnc >= 5){
      curnc-=5;
      n5++;
    }
    n1=curnc;
    
    if(n500!=0){System.out.println(n500 + " 500’s note");}
    if(n100!=0){System.out.println(n100 + " 100’s note");}
    if(n50!=0){System.out.println(n50 + " 50’s note");}
    if(n10!=0){System.out.println(n10 + " 10’s note");}
    if(n5!=0){System.out.println(n5 + " 5’s note");}
    if(n1!=0){System.out.println(n1 + " 1’s note");}
  }
}
