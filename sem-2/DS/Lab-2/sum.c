#include <stdio.h>

void main()
{
    int num;
    int i,sum=0;
    float avg=0;

    printf("Enter Number of Element :");
    scanf("%d",&num);

    int array[num];

    printf("Enter Number : \n");
    for(i=0;i<num;i++){
        scanf("%d",&array[i]);
        sum = sum + array[i];
    }
    avg = sum / num;
    printf("Total Sum is : %d\n",sum);
    printf("Total Average is : %f",avg);
}
