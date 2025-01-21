import java.util.Scanner;
public class Task_6 
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int space = num-1;
        
        for( int i=1; i<=num; i++)
        { 
            for(int k=space; k>0; k--){
                System.out.print("  ");
            }
            space--;                     
            for(int j=1; j<=(2*i-1); j++)
            {                 
                System.out.print(j+" ");
             }                        
         System.out.println();
        }
         int num2=num-1;
         int space2=1;
         for( int I=num2; I>0; I--)
         {            
            for(int k=1; k<=space2; k++){
                System.out.print("  ");
            }
            space2++;
            
            
                for(int j=1; j<=(2*I-1); j++){
                    System.out.print(j+" ");
                }      
            
            System.out.println();          
         }
        sc.close();
    }   
}
