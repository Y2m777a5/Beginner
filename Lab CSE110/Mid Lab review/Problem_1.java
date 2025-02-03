import java.util.Scanner;

public class Problem_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt(); 
        //there is no deciaml point like .000 so it is int;
        float ltr = sc.nextFloat();
        //there is a decimal point like 35.0 so it is float;
        //I can use doble here. But I want to limit the numbers after the decimal points of the result;

        float avrg = dis/ltr;
        // Float is bigger than int so choose flaot for avrg;
        System.out.printf("%.3f km/l",avrg);
        // didn't use normal output to control the numbers after decimal point;
        sc.close();
    }
}