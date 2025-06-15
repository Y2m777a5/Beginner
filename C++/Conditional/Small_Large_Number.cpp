#include <iostream>
using namespace std;

int main()
{
    long a,b,c;
    cout << "\033[1;96m" << "\nEnter 1st number:" << "\033[97m" << endl;
    scanf("%ld", &a);
    cout << "\033[1;96m" << "\nEnter 2nd number:" << "\033[97m" << endl;
    scanf("%ld", &b);
    cout << "\033[1;96m" << "\nEnter 3rd number:" << "\033[97m" << endl;
    scanf("%ld", &c);
    cout << "\n>> \033[38;2;170;255;0m";

    //Greatest Number check;
    if(a>b && a>c){
        printf("Greatest number: \033[1;95m%ld",a);
    }
    else if(b>a && b>c){
        printf("Greatest number: \033[1;95m%ld",b);
    }
    else{
        printf("Greatest number: \033[1;95m%ld",c);
    }
    cout << "\033[97m\n>> ";
    cout << "\033[38;2;170;255;0m";
   //Smallest Numbers check;
    if(a<b && a<c){
        printf("Smallest number: \033[1;95m%ld",a);
    }
    else if(b<a && b<c){
        printf("Smallest number: \033[1;95m%ld",b);
    }
    else{
        printf("Smallest number: \033[1;95m%ld",c);
    }
    cout << "\033[0m \n" << endl;
    return 0;
}
