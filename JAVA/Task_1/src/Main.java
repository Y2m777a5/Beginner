import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        //String month = sc.next();
        YearCalender(year);
    }

    //Leap year check;
    public static boolean isLeap(int a){
        boolean flag;
        if(a%4==0){
            flag = true;
            if(a%100==0){
                if(a%400==0){
                    flag=true;
                }
                else{
                    flag=false;
                }
            }
        }
        else{
            flag = false;
        }
        return flag;
    }

    //Numbers of leap years;
    public static int numLeap(int ny){
        int count = 0;
        for(int i=1;i<=ny; i++){
            if(isLeap(i)){
                count++;
            }
        }
        return count;
    }

    //1st day of Jan;
    public static int Fday(int year){
        int Day =(year + numLeap(year)%7);
        return Day;
    }
    //Calender;
    public static void YearCalender(int y){
        String [] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int lenW = week.length;

        //Calculate day of Jan 1;
        int day = Fday(y);

        //Dates of Months;
        int month = 1;
        while(month<13){
            //print days;
            for(int i=0; i<lenW; i++){
                if(i<(lenW-1)){
                    System.out.print(week[i]+" ");
                }
                else{
                    System.out.println(week[i]);
                }
            }
            int date = 1;
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                //print mentioned month and year;
                if(month==1){
                    System.out.println("January "+y);
                }
                else if(month==3){
                    System.out.println("March "+y);
                }
                else if(month==5){
                    System.out.println("May "+y);
                }
                else if(month==7){
                    System.out.println("Julay "+y);
                }
                else if(month==8){
                    System.out.println("August "+y);
                }
                else if(month==10){
                    System.out.println("October "+y);
                }
                else if(month==12){
                    System.out.println("December "+y);
                }
                for(int sp=day; sp>1; sp--){
                    System.out.print(" ");
                }
                while(date<32){
                    for(int i=day; i<8 && date!=32; i++){
                        if(i!=7 && date<31){
                            System.out.print(date++ +" ");
                        }
                        else if(i!=7 && date==31){
                            System.out.println(date +" ");
                            day = i;
                        }
                        else{
                            System.out.println(day);
                            day = 1;
                            break;
                        }
                    }
                }
                month++;
            }
            else if(month==2){
                continue;
            }
            else{
                continue;
            }
        }
    }
}