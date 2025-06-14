package Task_01;

public class BBAStudent extends Student {
    public BBAStudent(){
        updateName("Default");
        updateDepartment("BBA");
    }

    public BBAStudent(String n){
        updateName(n);
        updateDepartment("BBA");
    }
}
