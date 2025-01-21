
public class Task_2 {
  public static void showDots(int a){
    for(int i=0; i<a; i++){
      System.out.print(".");
    }
  }
  
  public static void show_palindrome(int a){
    for(int i=1; i<=a; i++){
      System.out.print(i);
      }
    for(int i=a-1; i>0; i--){
      System.out.print(i);
    }
  }
  
  public static void showDiamond(int a){
    for(int i=1; i<=a; i++){
      showDots(a-i);
      show_palindrome(i);
      showDots(a-i);
      System.out.println();
      }
    for(int i=a-1; i>0; i--){
      showDots(a-i);
      show_palindrome(i);
      showDots(a-i);
      System.out.println();
    }
  }
  
  public static void main(String[] args) { 
    showDots(5);
    System.out.println();
    showDots(3);
    System.out.println();
    
    show_palindrome(5);
    System.out.println();
    show_palindrome(3);
    System.out.println();
    
    showDiamond(5);
    showDiamond(3);
  }
  
  /* ADD YOUR CODE HERE */
  
}
