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
	int max= *p;
	for(i=0;i<num;i++){
		if(*(p + i)>max){
			max = *(p + i);
		}
	}
	printf("Max is :  %d",max);	
}
