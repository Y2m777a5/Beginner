//Code for Addition

#include<stdio.h>
#define cyan "\033[1;91m"
#define purple "\033[1;95m"
#define blue "\033[1;94m"
#define reset "\033[0m"

void main()
{
    double a,b;
    printf(cyan"\n        !!Welcome to 'Addition Function'!!\nYou can calculate addition of two numbers here......\n");

    printf(purple"\nPlease enter value-1 : "reset);
    scanf("%lf",&a);
    
    printf(purple"Please enter value-2 : "reset);
    scanf("%lf",&b);
    
    printf(blue"Result is "reset"%.4lf\n\n", (a+b));
}