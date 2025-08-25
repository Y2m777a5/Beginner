#include<stdio.h>

int search(int a[], int b, int size){
    for(int i=0; i<size; i++){
        if(a[i]==b){
            return i;
        }
    }
    return -1;
}

int main(){
    int x[10];
    int y;
    printf("Enter number want to search: ");
    scanf("%d",&y);

    printf("Enter numbers: ");
    for(int i=0; i<10; i++){
        scanf("%d",&x[i]);
    }

    int found = search(x,y,10);

    if(found!=-1){
        printf("Found at index: %d", found+1);
    }
    else{
        printf("Not found");
    }

    return 0;
}