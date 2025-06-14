import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        boolean flag = false;
        for(int i=1; i<=num; i++){
            int temp = 0; // temp is temporary sums like (1),(1+2),(1+2+3),...;
            for(int j=0; j<=i; j++){
                temp+=j;
            }
            if(i%2==0){ // for every even "i" flag value will change (flase <--> true);
                if(flag){ // if flag is true then it will add;
                    sum+=temp;
                    flag = false;
                }
                else{ // else it will subtract;
                    sum-=temp;
                    flag = true;
                }
            }
            else{
                if(flag){ // if flag is true then it will add;
                    sum+=temp;
                }
                else{ // else it will subtract;
                    sum-=temp;
                }
            }
        }
        System.out.println(sum);


        // Alternative_1
        
        // for(int i=1; i<=num; i++){
        //     int temp = 0;
        //     for(int j=0; j<=i; j++){
        //         temp+=j;
        //     }
        //     if(i%4==1 || i%4==2){ // 1st 2 divisor of 4 will subtract; 
        //         sum-=temp;
        //     }
        //     else{ // last 2 divisor of 4 will add;
        //         //I didn't use the condition, it was worthless to use;
        //         sum+=temp;
        //     }
        // }
        // System.out.println(sum);
        sc.close();
    }
}
