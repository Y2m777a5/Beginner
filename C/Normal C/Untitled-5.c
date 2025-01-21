//Area and circumference of a circle
# include <stdio.h>
# define pi 3.14159265359
 void main()
 {
    float radius,area,circumference;
    printf("\n!! Welcome !! You can calculate area and circumference of a circle here.\nJust put the value of a radius below....\n");

    printf("Please input the value - ");
    scanf("%f",&radius);

    area = pi* radius* radius;
    circumference = 2* pi* radius;

    printf("The area is %f\nThe circumference is %f",area,circumference);
 }
