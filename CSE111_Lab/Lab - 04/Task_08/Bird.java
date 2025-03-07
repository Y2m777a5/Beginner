
public class Bird {
  public String name;
  public int dstnc = 0;
  
  public void makeNoise(){
    if(name.equals("Parrot")){
      System.out.println("Squawk");
    }
    else{
      System.out.println("Squee");
    }
  }
  
  public void flyUp(int up){
    dstnc+=up;
    System.out.println(name+" has flown up "+up+" feet.");
  }
  
  public void flyDown(int down){
    boolean flag = false;
    if(dstnc<down){
      System.out.println(name+" cannot fly down "+down+" feet.");
    }
    else{
      dstnc-=down;
      flag = true;
    }
    if(dstnc>0 && flag){
      System.out.println(name+" has flown down "+down+" feet.");
    }
    else if(dstnc==0 && flag){
      System.out.println(name+" has flown down "+down+" feet and landed.");
    }
  }
}
