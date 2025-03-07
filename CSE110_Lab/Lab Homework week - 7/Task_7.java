import java.util.Scanner;
public class Task_7 
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int space = num-1;
        
        for( int i=1; i<=num; i++)
        {            
            for(int k=space; k>0; k--)
            {
                System.out.print(" ");
            }
            space--;            
            if(i==1){
                for(int j=1; j<=(2*i-1); j++)
                {
                    System.out.print(j);
                }
            }
            else 
            {
                for(int j=1; j<=(2*i-1); j++)
                {
                    if(j==1 || j==(2*i-1))
                    {
                        System.out.print(j);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }           
            System.out.println();
        }
        
        int num2=num-1;
        int space2=1;
        for( int i=num2; i>0; i--)
        {           
            for(int k=1; k<=space2; k++)
            {
                System.out.print(" ");
            }
            space2++;
            
            if(i==1)
            {
                for(int j=1; j<=(2*i-1); j++)
                {
                    System.out.print(j);
                }
            }
            else
            {
                for(int j=1; j<=(2*i-1); j++)
                {
                    if (j==1 || j==(2*i-1)) 
                    {   
                        System.out.print(j);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }            
            System.out.println();
        }
        sc.close();
    }   
}