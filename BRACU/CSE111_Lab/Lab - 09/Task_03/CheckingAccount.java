package Task_03;

public class CheckingAccount extends Account{
    public static int count;

    public CheckingAccount(){
        super(0.0);
        count++;
    }

    public CheckingAccount(double b){
        super(b);
        count++;
    }
}
