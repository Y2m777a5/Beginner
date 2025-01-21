
public class MagicItem {
  public String name;
  public int elvl;
  public String [] itm = new String [3];
  public int count=0;
  
  public void newCharacter(String name){
    this.name = name;
  }
  
  public void findItem(String temp){
    if(count++<3){
      for(int i=0; i<3; i++){
        if(itm[i] == null){
          itm[i]=temp;
          break;
        }
      }
      System.out.println(name+" found a "+temp);
    }
    else{
      System.out.println("All item slots occupied.");
    }
  }
  
  public void displayInfo(){
    System.out.println("Character Name: "+name+"\nEnergy Level: "+elvl);
    for(int i=0; i<3; i++){
      System.out.println("Item "+(++i)+": "+itm[--i]);
    }
  }
  
  public void useItem(String temp){
    boolean flag = true;
    for(int i=0; i<3; i++){
      if(temp.equals(itm[i])){
        flag = false;
        System.out.println(name+" used a "+temp);
        itm[i]=null;
        count--;
        if(temp.equals("Potion")){
          elvl+=50;
        }
        else if(temp.equals( "Elixir")){
          elvl+=100;
        }
        else{
          elvl+=200;
        }
        System.out.println("Energy Level after using item: "+elvl);
        break;
      }
    }
    if(flag){
      System.out.println("Item not in inventory.");
    }
  }
}
