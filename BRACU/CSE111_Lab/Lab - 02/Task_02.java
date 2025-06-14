
public class Task_02{
  
  
  public static void main(String[] args) { 
    System.out.println("Task_02");
    
    int i=2;
    System.out.print(i+", ");
    
    //1st half
    while(i<20){
      i+=2;
      System.out.print(i+", ");
    }
    
    //2nd half
    while(i>2){
      i-=2;
      if(i==2){
        System.out.println(i);
      }
      else{
        System.out.print(i+", ");
      }
    }
  }
}
