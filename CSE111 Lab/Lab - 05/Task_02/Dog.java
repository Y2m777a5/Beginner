
public class Dog {
  public String name="";
  public String color="";
  
  public void changeName(String name){
    this.name = name;
  }
  
  public void changeColor(String color){
    this.color = color;
    if(name.equals("")){
      System.out.println("This dog is "+color);
    }
    else{
      System.out.println(name+" is "+color);
    }
  }
  
  public String bark(){
    if(name.equals("") && color.equals("")){
      return "A dog is barking";
    }
    else if(name.equals("")){
      return color+" dog is barking";
    }
    else if(color.equals("")){
      return name+" is barking";
    }
    else{
      return name+" the "+color+" dog is barking";
    }
  }
}
