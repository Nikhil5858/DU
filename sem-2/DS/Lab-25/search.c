#include<stdio.h>

int linearSearch(int array[], int n, int x){
	int i;
	int flag = 0;
	for(i=0;i<n;i++){
		if(x != array[i]){
			continue;
		}
		else{
			flag=1;
			printf("Found at : %d",i);
			break;
		}
	}
	if(flag==0){
		printf("Element Not found!");
	}
}

void main(){
	int num,i,x;
	printf("Enter Number : ");
	scanf("%d",&num);
	int array[num];
	
	printf("Enter Number of Element : ");
	for(i=0;i<num;i++){
		scanf("%d",&array[i]);
	}
	
	printf("Enter Number to Search : ");
	scanf("%d",&x);
	
	linearSearch(array,num,x);		
}
