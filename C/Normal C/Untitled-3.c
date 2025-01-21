// Code for Average
/*Average of three numbers*/
#include <stdio.h>
 
 void main()
 {
    float a,b,c,result;
    
    printf("\n!!Welcome to 'Average Function'!! You can calculate average of three numbers here.....\n");

    printf("Please enter value 1 -");
    scanf("%f",&a);

    printf("Please enter value 2 -");
    scanf("%f",&b);

    printf("Please enter value 3 -");
    scanf("%f",&c);

    result =(a+b+c)/3;
    printf("The result is %f\n",result);
 }
