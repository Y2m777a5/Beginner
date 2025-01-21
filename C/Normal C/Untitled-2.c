//Code for Addition

#include<stdio.h>

void main()
{
    float a,b,result;
    printf("\n!!Welcome to 'Addition Function'!! You can calculate addition of two numbers here.....\n");

    printf("Please enter value 1 -");
    scanf("%f",&a);
    
    printf("Please enter value 2 -");
    scanf("%f",&b);
    
    result = a + b;
    printf("Result is %f\n", result);
}