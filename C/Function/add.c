#include<stdio.h>

int add(int a, int b){
    return a+b;
}

int main(){
    int x,y;
    printf("Enter numbers: ");
    scanf("%d%d",&x,&y);

    for(int i=0; i<3; i++){
        printf("Result: %d\n",add(x++,y++));
    }

    return 0;
}