package Task_06;

public class Circle extends Shape {
    public int radius;
    
    public void area() {
        System.out.println("Area of Red Circle: "+(Math.PI*Math.pow(radius,2)));
    }
}
