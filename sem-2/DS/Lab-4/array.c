#include <stdio.h>
void main(){
	int num,i;
	printf("Enter Number Of Element  : \n");
	scanf("%d",&num);
	
	int array[num];
	printf("Enter NUmber : \n");
	for(i=0;i<num;i++){
		scanf("%d",&array[i]);
	}
	int *p = array;
	for(i=0;i<num;i++){
		printf("%d ",&p);
	}	
}
