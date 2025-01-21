import java.util.Scanner;
public class Task_6 {
  
  
  public static void main(String[] args) { 
    int [] marks = {85, 90, 75, 44, 99};
    String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    for (int i = 0; i < marks.length - 1; i++){
      for (int j = 0; j < marks.length - i - 1; j++){
        if (marks[j] > marks[j + 1]) {
          int temp = marks[j];
          marks[j] = marks[j + 1];
          marks[j + 1] = temp;
          
          String stemp = names[j];
          names[j] = names[j+1];
         names[j+1] = stemp;
        }
      }
    }
    System.out.println("Sorted Array:");
    for(int i=0; i<marks.length;i++){
       if(i!=marks.length-1){
         System.out.print(marks[i]+" ");}
       else{
         System.out.println(marks[i]);}
        }
    for(int i=0; i<names.length;i++){
       if(i!=names.length-1){
         System.out.print(names[i]+" ");}
       else{
         System.out.println(names[i]);}
        }
  }
  
  /* ADD YOUR CODE HERE */
  
}
