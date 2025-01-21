/*import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inp =sc.nextInt();
        int n=2;
        
        for(int i=0;i<inp;i++){
            while(true){
              
           int sum=0; int j=2;
            
            while(j<n){
               int r=n%j;
                if(r==0){sum=sum+j;}
                j++;}
            
            if((sum+1)==n){
                System.out.println(n);break;}
            
            n++;
            }
            n++;
        }
        sc.close();
        
    }
}*/


import java.util.Scanner;
public class Task_5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("number ");
        int n = sc.nextInt();
        
        int i=2;
        int k=0; 
     // n th times loop will rotate
        while(k<n)  
        {
                int j=2;
                int sum=1;
     //calculating sum of divisors
                while(j<i)
                    
                {
                    int r=i%j;
                    if(r==0)
                    {
                        sum+=j;
                    }
                    j++;
                }
     // k will only increase after a perfect number is detected
                if(sum==i)
                {
                    System.out.println(i);
                    k++; 
                }
                i++;
        }
       sc.close();
    }
}