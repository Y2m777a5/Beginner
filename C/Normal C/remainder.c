#include <stdio.h>

int main(){
    int a,b;
    printf("\n\033[1;97mEnter number: \033[38;2;0;255;255;1m");
    scanf("%d",&a);
    printf("\n\033[1;97mEnter number: \033[38;2;0;255;255;1m");
    scanf("%d",&b);
    a = a-((a/b)*b);
    printf("\n\033[1;92mResult : %d\033[0m\n\n",a);
    return 0;
}