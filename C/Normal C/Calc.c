#include<stdio.h>

void main(){
    int a,b;
    char operator;
    printf("enter numbers: ");
    scanf("%d%d",&a,&b);
    printf("enter operator: ");
    scanf(" %c",&operator);

    if(operator=='+'){
        printf("Addition : %d",(a+b));
    }
    else if(operator=='-'){
        printf("Addition : %d",(a-b));
    }
    else if(operator=='*'){
        printf("Addition : %d",(a*b));
    }
    else if(operator=='/'){
        printf("Addition : %d",(a/b));
    }
    else{
        printf("Invalid operator");
    }

    //Alternative;
    // switch (operator){
    //     case '+':
    //         printf("Addition : %d",(a+b));
    //         break;
        
    //     case '-':
    //         printf("Subtraction : %d",(a-b));
    //         break;
        
    //     case '*':
    //         printf("Multiplication : %d",(a*b));
    //         break;

    //     case '/':
    //         printf("Division : %d",(a/b));
    //         break;

    //     default:
    //         printf("Invalid operator");
    // }
}