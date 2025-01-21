package Task_08;

public class Student {
    public String name;
    public String dept;
    public int tid;
    public int did;
    public static int cse;
    public static int bba;
    public static int total;

    public Student(String n, String dept){
        name = n;
        this.dept = dept;
        tid = ++total;
        System.out.println("Creating Student Number: "+total);
        if(dept.equals("CSE")){
            did = ++cse;
        }
        else{
            did = ++bba;
        }
    }

    public void individualInfo(){
        System.out.println(name+" is from "+dept+" department.\n"+
        "Serial of "+name+" among all students' is: "+tid+
        "\nSerial of "+name+" in "+dept+" department is: "+did);
    }

    public static void totalInfo(){
        System.out.println("Total Students: "+total+
        "\nTotal CSE Students: "+cse+
        "\nTotal BBA Students: "+bba);
    }
}
