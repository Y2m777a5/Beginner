import java.util.Scanner;

public class Problem_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num);
        while(num!=1){ // For loop is waste of time and variable;
            // Loop will continue until num is 1;
            if(num%2==0){
                num/=2; // Even --> divided by 2;
            }
            else{
                num = (num*3)+1; // Odd --> multiplied by 3 and add 1;
            }
           System.out.print(","+num);
        }
        sc.close();
    }
}