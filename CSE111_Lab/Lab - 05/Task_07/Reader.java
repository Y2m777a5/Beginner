
public class Reader {
  public String naam = "New user";
  public int cpct;
  public String [] books;
  public int count;
  
  public void createReader(String name, int num){
    naam = name;
    cpct = num;
    books = new String [cpct];
  }
  
  public void addBook(String temp){
    if(count<cpct){
      System.out.println(count);
      books[count++] = temp;
    }
    else{
      System.out.println("No more space for new book");
    }
  }
  
  public void increaseCapacity(int num){
    String [] nbook = new String [num];
    for(int i=0; i<cpct; i++){
      nbook[i]=books[i];
    }
    cpct = num;
    books = new String [cpct];
    books=nbook;
    System.out.println(naam+"'s capacity increased to "+cpct);
  }
  
  public void readerInfo(){
    System.out.println("Name: "+naam+"\nCapacity: "+cpct+"\nBooks:");
    if(count>0){
      for(int i=0; i<count; i++){
        System.out.println("Book "+(++i)+": "+books[--i]);
      }
    }
    else{
      System.out.println("No books added yet");
    }
  }
}
