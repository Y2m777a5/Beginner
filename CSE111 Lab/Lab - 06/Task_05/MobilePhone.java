
public class MobilePhone {
  public int tcon = 0;
  public int [] numList;
  public String [] nameList;
  
  public void setContactCapacity(int n){
    numList = new int [n];
    nameList = new String [n];
  }
  
  public void details(){
    System.out.println("Total Contacts: "+tcon);
    System.out.println("Contact List:");
    for(int i=0; i<tcon; i++){
      System.out.println(nameList[i]+":"+numList[i]);
    }
  }
  
  public void addContact(String name, int num){
    if(tcon<numList.length){
      numList [tcon] = num;
      nameList[tcon++] = name;
      System.out.println("The contact of "+name+" is added.");
    }
    else{
      System.out.println("Storage Full!!");
    }
  }
  
  public void makeCall(int num){
    boolean flag = false;
    for(int i=0; i<tcon; i++){
      if(num==numList[i]){
        System.out.println("Calling "+nameList[i]+" . . .");
        flag = true;
      }
    }
    if(!flag){
      System.out.println("Calling "+num+" . . .");
    }
  }
}
