
public class Shape2D {
  public double area;
  public String name;
  public Shape2D(int side) { 
    name= "Square";
    System.out.println("A Square has been created with length: "+side);
    area= side*side;
  }
  
  public Shape2D(int side1, int side2) { 
    name= "Rectangle";
    System.out.println("A Rectangle has been created with length: "+side1+" and breadth:  "+side2);
    area= side1*side2;
  }
  
  public Shape2D(int side1, int side2, String name) { 
    this.name=name;
    System.out.println("A "+name+" has been created with height: "+side1+" and base:  "+side2);
    area= 0.5*side1*side2;
  }
  
  public Shape2D(int side1, int side2, int side3) { 
    this.name= "Triangle";
    System.out.println("A Triangle has been created with the following sides: "+side1+", "+side2+", "+side3);
    int s= (side1+side2+side3)/2;
    area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
  }
  
  public void area(){
    System.out.println("The area of the "+name+" is: "+area);
  }
}
