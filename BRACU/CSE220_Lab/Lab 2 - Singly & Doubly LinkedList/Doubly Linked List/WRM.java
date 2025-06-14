public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do 
        Patient last = dh;
        while(last.next!=dh){
            last =last.next;
        } 
        Patient P = new Patient(id, name, age, bloodgroup, dh.prev, dh.next);
        last.next = P;
        P.prev = last;
        P.next = dh;
        dh.prev = P;
        System.out.println("Success registering patient");
    }

    public void servePatient() {
        // To do
        Patient P = dh.next;
        Patient temp = P.next;
        temp.prev = dh;
        dh.next = temp;
        System.out.println(P.name+"is Served");
        
    }

    public void showAllPatient() {
        //To Do
        Patient p = dh.next;
        while(p!=dh){
            if (p.next!=dh){
                System.out.print(p.name+" ");
            }
            
            else{
                System.out.println(p.name);
            }
            p = p.next;
        }
    }

    public boolean canDoctorGoHome() {
        // To Do
        if(dh.next!=null){
            return false;
        }
        return true; // Delete this line once you're ready
    }

    public void cancelAll() {
        // To Do
        dh.next = dh;
        dh.prev = dh;
        System.out.println("All apppointments cancelled");
    }


    public void reverseTheLine() {
        // To Do
        Patient p = dh;
        Patient p1 = dh.next;
        Patient p2 = p1.next;

        while(p2!=dh){
            p1.next = p;
            p1.prev = p2; 
            p = p1;
            p1 = p2;
            p2 = p2.next;
        }
        p1.next = p;
        p1.prev = p2;
        dh.prev = dh.next;
        dh.next = p1;

        
        Patient P = dh.next;
        while(P!=dh){
            if (P.next!=dh){
                System.out.print(P.name+" ");
            }
            
            else{
                System.out.println(P.name);
            }
            P = P.next;
        }
    }

}