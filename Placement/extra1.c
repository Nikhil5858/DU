#include<stdio.h>

void main(){
	int num,i,sum=0;
	int target;
	int temp=0;
	
	printf("Enter Number of Element to Insert : \n");
	scanf("%d",&num);
	
	int arra[num];
		
	printf("Enter Element : \n");
	for(i=0;i<num;i++){
		scanf("%d",&arra[i]);
	}
	
	
	printf("\n");
	for(i=0;i<num;i++){
		printf(" %d",arra[i]);
	}	
	
	printf("\n");
	
	printf("Enter Target Value : ");
	scanf("%d",&target);
	
	for (i = 0; i < num - 1; i++) { 
 		sum = arra[i] + arra[i + 1];
	 		if(sum == target){
		   		printf("Values was Found  at %d and %d\n",arra[i],arra[i+1]);
				temp = 1;	
			}
    }
				
	if(!temp){
		printf("Value was not found!");
	}
}
