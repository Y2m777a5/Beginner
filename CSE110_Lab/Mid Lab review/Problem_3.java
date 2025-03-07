import java.util.Scanner;
import java.lang.Math;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        float dis = (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        // Using (float) before Math.sqrt to forcefully convert the result of Math.sqrt to float;
        // Math.sqrt only support double;
        // Using float to limit the decimal points;
        float slope = (y2-y1)/(x2-x1);
        System.out.printf("Distance: %.4f\n",dis);
        System.out.printf("Slope: %.4f\n", slope);

        //Using Condition to check the slope is positive or negative;
        if(slope>0){
            System.out.println("The slope is Positive");
        }
        else if(slope<0){
            System.out.println("The slope is Negative");
        }
        else{
            System.out.println("The slope is Zero");
        }
        sc.close();
    }
}
