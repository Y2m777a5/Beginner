
public class ChickenBurger {
  public String slvl [] = {"Mild", "Spicy", "Naga", "Extreme"};
  public String bun = "Sesame";
  public int price = 200;
  public String sauceOption = "Less";
  public String spiceLevel = "Not set";
  
  public String serveBurger(){
    if(!spiceLevel.equals("Not set")){
      return "The burger is being served:-"+
        "\nBun Type: "+bun+
        "\nPrice: "+price+
        "\nSauce Option: "+sauceOption+
        "\nSpice Level: "+spiceLevel;
    }
    else{
      return "Cannot serve now. Customize Spice Level first.";
    }
  }
  
  public void customizeSpiceLevel(String spice){
    boolean flag = false;
    for(int i=0; i<slvl.length; i++){
      if(spice.equals(slvl[i])){
        spiceLevel = spice;
        flag = true;
      }
    }
    if(flag){
      System.out.println("Spice level set to "+spiceLevel);
    }
    else{
      System.out.println("This spice level is unavailable.");
    }
  }
}
