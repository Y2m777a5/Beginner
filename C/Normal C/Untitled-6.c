//yo yo..
# include<stdio.h>
# include<math.h>

int main()
{
   float p,i,n,I,total_1,total_2,total;
   printf("\n WELCOME !! You can calculate compound interest here.....\n");
   printf("Input Principl (capital/money) - ");
   scanf("%f",&p);

   printf("Input interest rate - ");
   scanf("%f",&i);

   printf("Input time (in year) - ");
   scanf("%f",&n);

   I = i/100;
   total_1 = p*pow((1+I),n);

   printf("The result is %f\n",total_1);
   
   printf("If you want to do an addition with the result. Then you may go ahead....\n");
   printf("Please input the value you want to add - ");
   scanf("%f",&total_2);

   total = total_1 + total_2;
   printf("The second result is - %f",total);
   
   return 0;
}