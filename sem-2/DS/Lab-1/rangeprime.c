#include <stdio.h>
void main(){
    int num1,num2,i,j;
    int flag = 1;
    printf("Enter Number 1 : \n");
    scanf("%d",&num1);
    printf("Enter Number 2 : \n");
    scanf("%d",&num2);

    if(num2 < 2 ){
        printf("No Prime Number in Range!");
    }

    for(i=num1;i<=num2;i++){
        flag = 0;
        for(j=2;j<i;j++){
            if(i % j == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            printf("Prime Number : %d\n",i);
        }
    }
}
