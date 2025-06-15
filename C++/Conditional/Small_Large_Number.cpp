#include <iostream>
using namespace std;

int main()
{
    int a,b,c;
    cout << "\033[1;96m" << "\n\nEnter 1st number:" << "\033[97m" << endl;
    scanf("%d", &a);
    cout << "\033[1;96m" << "\nEnter 2nd number:" << "\033[97m" << endl;
    scanf("%d", &b);
    cout << "\033[1;96m" << "\nEnter 3rd number:" << "\033[97m" << endl;
    scanf("%d", &c);
    cout << "\n>> \033[38;2;170;255;0m";

    //Largest Number check;
    if(a>b && a>c){
        printf("Greatest number: \033[1;95m%d",a);
    }
    else if(b>a && b>c){
        printf("Greatest number: \033[1;95m%d",b);
    }
    else{
        printf("Greatest number: \033[1;95m%d",c);
    }
    cout << "\033[97m\n>> ";
    cout << "\033[38;2;170;255;0m";
   //Smallest Numbers check;
    if(a<b && a<c){
        printf("Smallest number: \033[1;95m%d",a);
    }
    else if(b<a && b<c){
        printf("Smallest number: \033[1;95m%d",b);
    }
    else{
        printf("Smallest number: \033[1;95m%d",c);
    }
    cout << "\033[0m \n" << endl;
    return 0;
}