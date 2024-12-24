#include <stdio.h>

void main(){

	int fact=1,num;
	int i;
    printf("Enter Number : ");
    scanf("%d",&num);
    for(i=1;i<=num;i++){
    	fact = fact * i;
	}
	printf("%d",fact);
}
