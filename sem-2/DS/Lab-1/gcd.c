#include <stdio.h>

void main(){
	
	int num1,num2,i;
	int gcd=1;
	printf("Enter Number 1 : ");
	scanf("%d",&num1);
	printf("Enter Number 2 : ");
	scanf("%d",&num2);
	
	for(i=2;i<=num1;i++){
		while((num1%i==0) && (num2%i==0)){
			gcd = gcd *i;
			num1 = num1/i;
			num2 = num2/i;
		}
	}
	printf("Gcd Number is : %d",gcd);
}
