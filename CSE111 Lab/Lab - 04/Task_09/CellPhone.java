
public class CellPhone {
  public String model = "unknown";
  public int count = 0;
  public String [] cStore = new String [3];
  
  public void storeContact(String temp){
    if(count==0){
      cStore[count]=temp;
      count++;
      System.out.println("Contact Stored");
    }
    else if(count<3){
      cStore[count]=temp;
      count++;
      System.out.println("Contact Stored");
    }
    else{
      System.out.println("Memory full. New contact can't be stored.");
    }
  }
  
  public void printDetails(){
    System.out.println("Phone Model "+model);
    System.out.println("Contacts Stored "+count);
    if(count>=1){
      System.out.println("Stored Contacts:");
      for(int i=0; i<count; i++){
        System.out.println(cStore[i]);
      }
    }
  }
}
