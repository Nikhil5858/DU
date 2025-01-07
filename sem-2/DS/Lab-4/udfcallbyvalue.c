#include <stdio.h>

int udf(int num1,int num2){
	int temp;
	temp = num1;
	num1 = num2;
	num2 = temp;
	printf("After Swap Number : %d %d",num1,num2);
}

void main(){
	int num1,num2;
	printf("Enter Number 1 : ");
	scanf("%d",&num1);
	printf("Enter Number 2 : ");
	scanf("%d",&num2);
	
	printf("Before Swap Number : %d %d \n",num1,num2);
	udf(num1,num2);
}
