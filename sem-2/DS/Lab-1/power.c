#include <stdio.h>

void main(){
	
	int num1,num2,i;
	int power=1;
	printf("Enter Number 1 : ");
	scanf("%d",&num1);
	printf("Enter Number 2 : ");
	scanf("%d",&num2);
	
	for(i=1;i<=num2;i++){
		power = power * num1;
	}
	
	printf("%d",power);
}
