#include <stdio.h>

int main(){
    int num,i;
    int re1,re2;
    printf("Enter Number of Element : \n");
    scanf("%d",&num);

    int array[num];
    printf("Enter Number : \n");

    for(i=0;i<num;i++){
       scanf("%d",&array[i]);
    }

    printf("Enter 1 Replace Number : ");
    scanf("%d",&re1);
    printf("Enter 2 Replace Number : ");
    scanf("%d",&re2);

    for(i=0;i<num;i++){
        if(array[i] == re1){
            array[i] = re2;
        }
    }

    printf("Final array : \n");
    for(i=0;i<num;i++){
        printf("%d",array[i]);
    }
    return 0;
}
