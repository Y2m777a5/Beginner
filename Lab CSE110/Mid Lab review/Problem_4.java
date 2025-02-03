import java.util.Scanner;
import java.lang.Math;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = (b*b)-(4*a*c); // determiner to check the result type;
        

        if(a!=0 && d>=0){ // Alternative --> if(a=0 && d<0){"impossible to calc"}; else{calculation of root1, root2};
        // condition#1 (a!=0) to prevent number being divided by 0;
        // condition#2 (d>=0) to prevent number being negative inside a Square root;
            float x1 = (float)((-b + Math.sqrt(d))/(2*a));
            float x2 = (float)((-b - Math.sqrt(d))/(2*a));
            System.out.printf("Root#1: = %.5f\n",x1);
            System.out.printf("Root#2: = %.5f\n",x2);
        }
        else{
            System.out.println("Impossible to calculate");
        }
        sc.close();
    }
}
