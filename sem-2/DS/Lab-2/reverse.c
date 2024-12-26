#include <stdio.h>

void main(){

    int num,i;
    printf("Enter Number Of Element: ");
    scanf("%d",&num);

    int array[num];

    printf("Enter Number : \n");
    for(i=0;i<num;i++){
        scanf("%d",&array[i]);
    }

    for(i=num-1;i>=0;i--){
        printf("%d",array[i]);
    }
}
