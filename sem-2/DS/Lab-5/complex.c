#include <stdio.h>

struct complex{
	int real;
	int img;	
}c1,c2,add;

int sum(){
	add.real = c1.real + c2.real;
	add.img = c1.img  + c2.img;
	printf("Addition is Real Number : %d\n",add.real);
	printf("Addition is Img Number : %d",add.img); 
}

void main(){
	
	int num1,num2,num3,num4;
	printf("Enter Real Number 1:");
	scanf("%d",&num1);
	printf("Enter Real Number 2:");
	scanf("%d",&num2);
	printf("Enter Img Number 3:");
	scanf("%d",&num3);
	printf("Enter Img Number 4:");
	scanf("%d",&num4);
	
	c1.real = num1;
	c2.real = num2;
	c1.img = num3;
	c2.img = num4;
	
	sum();
}
