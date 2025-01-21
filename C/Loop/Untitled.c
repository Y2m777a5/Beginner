#include<stdio.h>
void main()
{
    int a;
    int sum=0;
    for(a=0;a<10;a+1)
    {
        printf("Inputs: %d",a);
        scanf("%d",&a);
        sum = sum + a;
        printf("c sum: %d",sum);
    }
    printf("total sum%d",sum);
}
