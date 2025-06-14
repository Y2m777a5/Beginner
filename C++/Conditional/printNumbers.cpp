#include <iostream>
using namespace std;

int main()
{
    int n;
    loopstart:
    cout << "\033[1;96m" << "\n\nEnter number:" << "\033[97m" << endl;
    cin >> n;
    cout << ">> \033[38;2;170;255;0m";
    // Write your code here
    if(n>=1 && n<=100000000){
        if(n==1){
            printf("one");
        }
        else if(n==2){
            printf("two");
        }
        else if(n==3){
            printf("three");
        }
        else if(n==4){
            printf("four");
        }
        else if(n==5){
            printf("five");
        }
        else if(n==6){
            printf("six");
        }
        else if(n==7){
            printf("seven");
        }
        else if(n==8){
            printf("eight");
        }
        else if(n==9){
            printf("nine");
        }
        else{
            printf("Greater than 9");
        }
    }
    else{
        printf("\033[1;91mEnter number between 1-100000000\033[1;97m\n");
        goto loopstart;
    }
    cout << "\033[0m \n" << endl;
    return 0;
}
