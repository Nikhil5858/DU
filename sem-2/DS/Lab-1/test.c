#include <stdio.h>

void main()
{
    int array[] = {10,20,30,40};
    int i,sum=0;
    for(i=0;i<4;i++){
        sum = sum + array[i];
    }
    printf("%d",sum);
}
