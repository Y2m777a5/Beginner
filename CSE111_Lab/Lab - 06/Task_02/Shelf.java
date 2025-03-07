
public class Shelf {
  public int capacity = 0;
  public int nbook = 0;
  
  public void showDetails(){
    System.out.println("Shelf capacity: "+capacity);
    System.out.println("Number of books: "+nbook);
  }
  
  public void addBooks(int books){
    if((capacity-nbook)>books){
      nbook+=books;
      System.out.println(books+" books added to shelf");
    }
    else if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    else{
      System.out.println("Exceeds capacity");
    }
  }
}
