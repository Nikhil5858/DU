#include <stdio.h>

int fact(int num){
	if(num == 1){
		return 1;
	}
	else{
		return num*fact(num-1);
	}			
}

void main(){

	int value;
	printf("Enter Number : ");
	scanf("%d",&value);
	printf("%d",fact(value));

}
