package Task_07;

public class Account {
    public static int count = 0;
    public String name;
    public int age;
    public String occup;
    public int amount;

    public Account(String n, int a, String o, int am){
        name = n;
        age = a;
        occup = o;
        amount = am;
        count++;
    }

    public void addMoney(int a){
        amount+=a;
    }

    public void withdrawMoney(int a){
        if(amount-a>=0){
            amount-=a;
        }
        else{
            System.out.println("Insufficient money for withdrawal!");
        }
    }

    public void printDetails(){
        System.out.println("Name: "+name+
        "\nAge: "+age+
        "\nOccupation: "+occup+
        "\nTotal Amount: "+amount);
    }
}
