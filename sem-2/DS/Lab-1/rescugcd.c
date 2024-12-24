#include <stdio.h>

int gcd(int num1 , int num2){
	if(num1==0){
		return num2;
	}
	else if(num2==0){
		return num1;
	}
	else if(num1==num2){
		return num1;
	}
	else if(num1>num2){
		return gcd(num1-num2,num2);
	}
	else{
		return gcd(num1,num2-num1);
	}
}

void main(){
	printf("%d",gcd(12,36));
}
