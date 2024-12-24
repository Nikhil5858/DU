#include <stdio.h>

int power(int num1 , int num2){
	if(num2==1){
		return num1;
	}
	else{
		return num1*power(num1,num2-1);
	}
}

void main(){
	printf("%d",power(5,3));
}
