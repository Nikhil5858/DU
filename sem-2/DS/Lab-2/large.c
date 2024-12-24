#include <stdio.h>

void main(){
    int num,i,large=0;

    printf("Enter Number of Element : ");
    scanf("%d",&num);

    int array[num];

    printf("Enter Number : \n");
    for(i=0;i<num;i++){
        scanf("%d",&array[i]);
        if(array[i]> large){
            large = array[i];
        }
    }
    printf("Largest Number is : %d\n",large);
}
