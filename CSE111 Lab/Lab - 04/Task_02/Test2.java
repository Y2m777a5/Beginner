public class Test2{
    public static void main(String [] args){
      Circle crcl = new Circle();
      double pi = Math.PI;
      System.out.println("Radius of the circle is "+crcl.radius);
      System.out.println("Radius of the circle is "+(pi*crcl.radius*crcl.radius));
      System.out.println("The circumference of the circle is"+(2*pi*crcl.radius));                  
    }
}
