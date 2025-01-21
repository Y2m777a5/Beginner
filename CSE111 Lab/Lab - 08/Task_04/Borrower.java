package Task_04;

public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  
    public String name;
    public String [] bBook = new String [3];
    private int count;

    public Borrower(String name){
        this.name = name;
    }

    static void bookStatus(){
        System.out.println("Available Books:");
        for(int i=0; i<book_count.length; i++){
            System.out.println(book_name[i] +": "+ book_count[i] );
        }
    }

    public void borrowBook(String n){
        boolean flag = true;
        for(int i=0; i<book_count.length; i++){
            if(book_name[i].equals(n) && book_count[i]>0){
                bBook[count++] = book_name[i];
                book_count[i]--;
                flag = false;
            }
        }
        if(flag){
            System.out.println("This book is not available.");
        }
    }

    public void borrowerDetails(){
        System.out.println("Name: "+name);
        System.out.println("Books Borrowed:");
        for(int i=0; i<count; i++){
            System.out.println(bBook[i]);
        }
    }

    static int remainingBooks(String n){
        int remain=0;
        for(int i=0; i<book_count.length; i++){
            if(book_name[i].equals(n)){
                remain = book_count[i];
            }
        }
        return remain;
    }
  }
  