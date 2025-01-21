package Task_08;

public class ABCServer {
    public String sname = "Default";
    public String [] member = new String [10];
    public String [] role = new String [10];
    public int capacity = 10;
    public int count;
    public String rname;
    public boolean flag = false;

    public ABCServer(){}

    public ABCServer(String sname, int capacity){
        this.sname = sname;
        member = new String [capacity];
        role = new String [capacity];
        this.capacity = capacity;
    }

    public void addMembers (String mname){
        if(count<capacity){
            member[count] = mname;
            if(flag){
                role[count]=rname;
                flag = false;
            }
            else{
                role[count]="Rising Hero";
            }
            System.out.println(role[count++]+" is added.");
        }
        else{
            System.out.println("Sorry, maximum capacity exceeded");
        }
    }

    public void addMembers (String mname, String rname){
        this.rname=rname;
        flag = true;
        addMembers(mname);
    }

    public void details (){
        System.out.println("Server Name: "+sname);
        System.out.println("Member Capacity: "+capacity);
        System.out.println("Total Members: "+count);
        System.out.println("Members:");
        if(count>0){
            for(int i=0; i<count; i++){
                System.out.println("Name:Role --> "+member[i]+":"+role[i]);
            }
        }
    }
}
