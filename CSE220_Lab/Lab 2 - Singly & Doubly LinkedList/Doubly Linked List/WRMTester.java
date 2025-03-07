import java.util.Scanner;
public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        // To Do
        // Create WRM Object and call the necessary methods
        Scanner sc = new Scanner(System.in);
        WRM p = new WRM();
        while(true){
            System.out.println("\n==Choose an Option==");
            System.out.println("1. RegisterPatient()\n"+
            "2. ServePatient()\n"+
            "3. ShowAllPatient()\n"+
            "4. CanDoctorGoHome()\n"+
            "5. CancelAll()\\n"+
            "6. ReverseTheLine()\n"+
            "7. Exit");
            System.out.println("=====================");
            System.out.print("Enter your choice: ");
            System.out.println();
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Executing RegisterPatient()...");
                System.out.println("Enter ID: ");
                int I = sc.nextInt();
                System.out.println("Enter Name: ");
                String N = sc.next();
                System.out.println("Enter Age: ");
                int A = sc.nextInt();
                System.out.println("Enter Blood group: ");
                String B = sc.next();
                p.registerPatient(I, N, A, B);
            }
            else if(n==2){
                System.out.println("Executing ServePatient()...");
                p.servePatient();
            }
            else if(n==3){
                System.out.println("Executing ShowAllPatient()...");
                 p.showAllPatient();
            }
            else if(n==4){
                System.out.println("Executing CanDoctorGoHome()...");
                boolean flag = p.canDoctorGoHome();
                if(flag){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else if(n==5){
                System.out.println("Executing CancelAll()...");
                p.cancelAll();
            }
            else if(n==6){
                System.out.println("Executing ReverseTheLine()...");
                p.reverseTheLine();
            }
            else if(n==7){
                System.out.println("Thank you for using waiting room management system.");
                break;
            }
            else{
                System.out.println("No such option.");
            }
        }
        sc.close();        
    }
}

