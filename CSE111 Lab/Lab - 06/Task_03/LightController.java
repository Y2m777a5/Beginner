
public class LightController {
  public boolean status = false;
  public int lvl = 0;
  
  public void showLightStatus(){
    if(status){
      System.out.println("Light status: ON");
    }
    else{
      System.out.println("Light status: OFF");
    }
    System.out.println("Brightness Level: "+lvl);
  }
  
  public void adjustBrightness(int lvl){
    if(!status){
      System.out.println("Please turn on the light first!");
    }
    else{
      this.lvl+=lvl;
      if(this.lvl<0 || this.lvl>10){
        this.lvl-=lvl;
        System.out.println("Brightness out of range. Set between 0 to 10.");
      }
      else{
        System.out.println("Brightness adjusted.");
      }
    }
  }
  
  public void switchLight(){
    if(status){
      lvl=0;
      status = false;
      System.out.println("Lights are now OFF.");
    }
    else{
      lvl=1;
      status = true;
      System.out.println("Lights are now ON.");
    }
  }
  
  public String resetSettings(){
    lvl=1;
    return "Light settings have been reset.";
  }
}
